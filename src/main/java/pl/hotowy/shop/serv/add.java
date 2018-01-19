package pl.hotowy.shop.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.hotowy.shop.db.Database;
import pl.hotowy.shop.model.Graham;
import pl.hotowy.shop.model.Item;
import pl.hotowy.shop.model.Kajzerka;
import pl.hotowy.shop.model.Pszenna;

import java.util.List;



@Controller
public class add {



    private Database database;

    @Autowired
    public add(Database database) {
        System.out.println("construct");
        this.database = database;
    }

    @RequestMapping("/add1")
    public String addItem1(@RequestParam("number") int number){
        database.add(new Pszenna(number));

        return "added.html";
    }

    @RequestMapping("/add2")
    public String addItem2(@RequestParam("number") int number){
        database.add(new Graham(number));

        return "added.html";
    }

    @RequestMapping("/add3")
    public String addItem3(@RequestParam("number") int number){
        database.add(new Kajzerka(number));

        return "added.html";
    }

    @GetMapping("/cart")
    @ResponseBody
    public String cart(){
        System.out.println(database.toString());
        return database.toString();

    }

    @GetMapping("/sum")
    @ResponseBody
    public String sum(){
        double sum = 0;

        for (Item item : database.getDatabase()) {
            sum += item.getPrice()*item.getNumber();
        }
        return "<h1> Do zapłaty: "+sum+" zł </h1>";
    }
}

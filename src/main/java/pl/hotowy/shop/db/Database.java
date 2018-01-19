package pl.hotowy.shop.db;

import org.springframework.stereotype.Repository;
import pl.hotowy.shop.model.Item;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Database {

    private List<Item> database = new ArrayList<>();


    public void add(Item item){
        database.add(item);
    }

    public List<Item> getDatabase() {
        return database;
    }

    @Override
    public String toString() {
        String result = "";
        for (Item item : database) {
            result+=item.toString();

        }
        return result;
    }
}

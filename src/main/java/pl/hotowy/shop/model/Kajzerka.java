package pl.hotowy.shop.model;

public class Kajzerka extends Item{

    private final String name = "Kajzerka";
    private final double price = 0.50;
    private int number;


    public Kajzerka(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Kajzerka{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }
}

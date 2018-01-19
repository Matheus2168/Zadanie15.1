package pl.hotowy.shop.model;

public class Pszenna extends Item{

    private final String name = "Pszenna";
    private final double price = 0.65;
    private int number;


    public Pszenna(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Pszenna{" +
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

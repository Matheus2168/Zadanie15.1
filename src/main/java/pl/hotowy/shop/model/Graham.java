package pl.hotowy.shop.model;

public class Graham extends Item{

    private final String name = "Graham";
    private final double price = 0.55;
    private int number;


    public Graham(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Graham{" +
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

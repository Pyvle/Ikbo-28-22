package Pr_9.Pr_9_2;

public class Bread implements Priceable{
    private double price;

    public Bread(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

package Pr_9.Pr_9_2;

public class Apple implements Priceable{
    private double price;

    public Apple(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

package Pr_9.Pr_9_2;

import Pr_9.Pr_9_1.Car;
import Pr_9.Pr_9_1.Nameable;
import Pr_9.Pr_9_1.Planet;

public class Main {
    public static void main(String[] args) {
        Priceable bread = new Bread(12.5);
        Priceable apple = new Apple(100.25);

        System.out.println(bread.getPrice());
        System.out.println(apple.getPrice());
    }
}

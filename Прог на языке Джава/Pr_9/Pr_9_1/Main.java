package Pr_9.Pr_9_1;

public class Main {
    public static void main(String[] args) {
        Nameable car = new Car("Honda");
        Nameable planet = new Planet("Earth");

        System.out.println(car.getName());
        System.out.println(planet.getName());
    }
}

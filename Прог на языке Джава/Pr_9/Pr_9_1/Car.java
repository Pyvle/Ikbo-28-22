package Pr_9.Pr_9_1;

public class Car implements Nameable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


}

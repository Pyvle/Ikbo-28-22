package Task_2;

public class Chihuahua extends Dog{
    boolean eyes;
    public Chihuahua(int age,boolean eyes) {
        super(age);
        this.eyes = eyes;
    }

    @Override
    public String getBreed() {
        return "chihuahua";
    }

    public Chihuahua(int age, String peculiarities, boolean eyes) {
        super(age,peculiarities);
        this.eyes = eyes;
    }
    public String toString() {
        return "Breed: chihuahua" + ", age: " + age +
                "\nPeculiarities: " + peculiarities;
    }
}

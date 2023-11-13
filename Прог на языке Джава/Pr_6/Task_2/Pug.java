package Task_2;

public class Pug extends Dog{
    private String tail;
    public Pug(int age,String tail) {
        super(age);
        this.tail = tail;
    }
    public Pug(int age, String peculiarities,String tail) {
        super(age,peculiarities);
        this.tail = tail;
    }

    @Override
    public String getBreed() {
        return "Pug";
    }

    public String getTail() {
        return tail;
    }
    public String toString() {
        return "Breed: pug" + ", age: " + age + ", tail: " + tail +
                "\nPeculiarities: " + peculiarities;
    }
}

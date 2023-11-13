package Task_2;

public abstract class Dog {
    protected int age;
    protected String peculiarities = "";
    public Dog(int age) {
        this.age = age;
    }
    public Dog(int age, String peculiarities) {
        this.age = age;
        this.peculiarities = " " + peculiarities;
    }

    public int getAge() {
        return age;
    }

    public abstract String getBreed();

    public void setPeculiarities(String peculiarities) {
        this.peculiarities += peculiarities;
    }

    public String getPeculiarities() {
        return peculiarities;
    }

    public abstract String toString();
}

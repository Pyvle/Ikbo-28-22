package Task_3;

public class Table extends Furniture{
    private int numberOfLegs;
    public Table(String color, String material, int numberOfLegs) {
        super(color, material);
        this.numberOfLegs = numberOfLegs;
    }

    public final int getNumberOfLegs() {
        return numberOfLegs;
    }
    public final void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of legs: " + numberOfLegs;
    }
}

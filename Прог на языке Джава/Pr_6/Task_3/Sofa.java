package Task_3;

public class Sofa extends Furniture{
    private int seats;
    public Sofa(String color, String material, int seats) {
        super(color, material);
        this.seats=seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
    public String toString() {
        return super.toString() + "\n"
                + "Number of seats: " + seats;
    }
}

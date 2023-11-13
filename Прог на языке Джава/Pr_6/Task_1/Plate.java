package Task_1;

public class Plate extends Dish{
    private int radius;
    public Plate(int radius, String color, String material) {
        super(color, material);
        this.radius = radius;
    }
    public int getRadius () {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Plate\n" + "Color: " + color +", material: " + material + "\n" +
                "Radius: " + radius;
    }
}

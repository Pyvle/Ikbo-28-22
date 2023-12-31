package Task_1;

public abstract class Dish {
    protected String color = "";
    protected String material = "";
    public Dish(String color, String material) {
        this.color = color;
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String toString() {
        return "Color: " + color +", material: " + material;
    }
}

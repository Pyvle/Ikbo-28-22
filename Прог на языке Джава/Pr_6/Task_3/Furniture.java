package Task_3;

public abstract class Furniture {
    protected String color;
    protected String material;
    public Furniture(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    public  String toString() {
        return "Color: " + color + ", material: " + material;
    }
}

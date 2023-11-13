package Task_1_2_3;

public class Circle extends Shape{
    protected double radius;
    public Circle() {
        radius = 0.0;
        filled = false;
        color = "";
    }
    public Circle(double radius) {
        this.radius = radius;
        filled = false;
        color = "";
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius= radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: " + color + ", filled: " + filled;
    }
}

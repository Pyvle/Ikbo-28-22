package Task_1_2_3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        width = 0.0;
        length = 0.0;
        color = "";
        filled = false;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return width*2 + length*2;
    }
    public String toString() {
        return "Shape: rectangle, width: "+width+", length: "+ length + ", color: "+color + ", filled: " + filled;
    }
}

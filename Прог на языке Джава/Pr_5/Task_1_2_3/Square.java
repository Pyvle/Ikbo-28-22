package Task_1_2_3;

public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return super.width;
    }
    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }
    public void setWidth(double side) {
        super.width = side;
    }
    public void setLength(double side) {
        super.length = side;
    }
    public String toString() {
        return "Shape: square, side: "+ getSide() + ", color: "+color + ", filled: " + filled;
    }
}

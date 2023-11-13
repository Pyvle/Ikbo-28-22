package Task_1;

import static java.lang.Math.sqrt;

public class Circle {
    private double radius;
    private double square;
    private double length;
    public Circle() {
        radius = 0.0;
        square = 0.0;
        length = 0.0;
    }
    public Circle(double radius) {
        this.radius = radius;
        length = 2*3.14*radius;
        square = 3.14*radius*radius;
    }

    public void setLength(double length) {
        this.length = length;
        radius = length/(2*3.14);
        square = 3.14*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        length = 2*3.14*radius;
        square = 3.14*radius*radius;
    }
    public void setSquare(double square) {
        this.square = square;
        radius = sqrt(square/3.14);
        length = 2*3.14*radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Circle \n" + "radius: " + radius + "\nsquare: " + square + "\nlength: " + length;
    }
}

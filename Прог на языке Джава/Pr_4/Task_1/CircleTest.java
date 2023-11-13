package Task_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius "+circle.getRadius());
        System.out.println("Length "+circle.getLength());
        System.out.println("Square "+circle.getSquare());
        Circle circle1 = new Circle(10.0);
        System.out.println(circle1.toString());
        circle.setRadius(5.0);
        System.out.println(circle.toString());
        circle.setLength(5.0);
        System.out.println(circle.toString());
        circle.setSquare(5.0);
        System.out.println(circle.toString());
    }
}
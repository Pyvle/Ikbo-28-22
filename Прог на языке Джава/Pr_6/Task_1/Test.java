package Task_1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(10,"Blue","Clay");
        System.out.println(plate);
        System.out.println("Color " + plate.getColor());
        System.out.println("Material " + plate.getMaterial());
        plate.setRadius(11);
        System.out.println("Radius " + plate.getRadius());
        Cup cup = new Cup(10,20,"White","Glass");
        System.out.println(cup);
        System.out.println("Color " + cup.getColor());
        System.out.println("Material " + cup.getMaterial());
        cup.setTopRadius(12);
        cup.setBottomRadius(11);
        System.out.println("Top radius " + cup.getTopRadius());
        System.out.println("Bottom radius " + cup.getBottomRadius());
    }
}
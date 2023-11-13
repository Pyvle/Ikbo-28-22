package Task_3;

public class Test {
    public static void main(String[] args) {
        FurnitureShop furniture = new FurnitureShop("red", "tissue", 5,
                "blaсk","wood",4);
        furniture.displaySofa();
        System.out.println();
        furniture.displayTable();
        System.out.println();
        System.out.println(furniture);
    }
}

package Task_3;

public class FurnitureShop{
    Sofa sofa;
    Table table;
    public FurnitureShop(String color1, String material1, int number1, String color2, String material2, int number2) {
        sofa = new Sofa(color1,material1,number1);
        table = new Table(color2,material2,number2);
    }
    public void displaySofa() {
        System.out.println("Sofa\n" + sofa);
    }
    public void displayTable() {
        System.out.println("Table\n" + table);
    }

    public String toString() {
        return "Sofa\n" + sofa + "\nTable\n" + table;
    }
}

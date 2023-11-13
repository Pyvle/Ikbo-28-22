package Task_4_5;

public class Test {
    public static void main(String[] args) {
        Movable a = new MovableCircle(1,1,2,2,3);
        System.out.println(a);
        a.moveDown();
        System.out.println(a);
    }
}

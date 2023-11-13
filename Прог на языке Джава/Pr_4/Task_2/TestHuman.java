package Task_2;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human("big","long","long");
        System.out.println(human.toString());
        System.out.println(human.getHead());
        System.out.println(human.getHand());
        System.out.println(human.getLeg());
    }
}

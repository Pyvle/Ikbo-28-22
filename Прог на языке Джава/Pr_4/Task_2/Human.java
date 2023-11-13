package Task_2;

public class Human extends Head {
    public Human(String head, String leg, String hand) {
        super(head, leg, hand);
    }
    public String toString() {
        return "Human\n" +getHead()+"\n"+
                getLeg()+ "\n"+
                getHand();
    }
}

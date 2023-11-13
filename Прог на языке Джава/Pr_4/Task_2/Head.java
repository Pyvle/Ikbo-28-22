package Task_2;

public class Head extends Leg{
    private String head;
    public Head(String head, String leg, String hand) {
        super(leg, hand);
        this.head = head;
    }
    public String getHead() {
        return "Head: " + head;
    }
    public void setHead(String head) {
        this.head = head;
    }
}

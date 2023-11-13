package Task_2;

public class Leg extends Hand{
    private String leg;
    public Leg(String leg, String hand) {
        super(hand);
        this.leg = leg;
    }
    public String getLeg() {
        return "Leg: " + leg;
    }
    public void setLeg(String leg) {
        this.leg = leg;
    }
}

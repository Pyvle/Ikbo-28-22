package Task_1;

public class Cup extends Dish{
    private int topRadius;
    private int bottomRadius;
    public Cup(int bottomRadius, int topRadius, String color, String material) {
        super(color, material);
        this.topRadius = topRadius;
        this.bottomRadius = bottomRadius;
    }

    public int getBottomRadius() {
        return bottomRadius;
    }
    public void setBottomRadius(int a) {
        bottomRadius = a;
    }

    public int getTopRadius() {
        return topRadius;
    }

    public void setTopRadius(int topRadius) {
        this.topRadius = topRadius;
    }
    public String toString() {
        return "Cup\n" + "Color: " + color +", material: " + material +
                "\nBottom radius: " + bottomRadius + ", top radius: " + topRadius;
    }
}

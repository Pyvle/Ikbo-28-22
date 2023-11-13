package Task_4_5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public String toString() {
        return "Circle radius: " + radius + "\n" + center;
    }
    public void moveUp () {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveRight() {
        center.moveRight();
    }
    public void moveLeft() {
        center.moveLeft();
    }
}

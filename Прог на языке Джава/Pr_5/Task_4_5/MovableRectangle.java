package Task_4_5;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1,int y1,int xSpeed1,int ySpeed1,int x2,int y2,int xSpeed2,int ySpeed2) {
        topLeft = new MovablePoint(x1,y1,xSpeed1,ySpeed1);
        bottomRight = new MovablePoint(x2,y2,xSpeed2,ySpeed2);
    }
    public boolean differentSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public String toString() {
        if (differentSpeed()) {
            return "top left: x: " + topLeft.x + "y: " + topLeft.y +
                    "xSpeed: " + topLeft.xSpeed + "ySpeed: " + topLeft.ySpeed +
                    "bottom right: x: " + bottomRight.x + "y: " + bottomRight.y +
                    "xSpeed: " + bottomRight.xSpeed + "ySpeed: " + bottomRight.ySpeed;
        }
        return "different speed at points";
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

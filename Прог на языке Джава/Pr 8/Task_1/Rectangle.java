package Task_1;

import java.awt.*;

public class Rectangle extends Shape{
    private int w,h;

    public Rectangle(Color color, int x,int y, int width, int height) {
        super(color,x,y);
        w = width;
        h = height;
    }
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,w,h);
    }
}

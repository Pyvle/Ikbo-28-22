package Task_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test extends JPanel {
    private List<Shape> shapes;
    public Test() {
        shapes = new ArrayList<>();
        Random rand = new Random();

        for(int i=0;i<20;i++) {
            int x = rand.nextInt(800);
            int y = rand.nextInt(800);
            int wOrR = rand.nextInt(100)+10;
            int h = rand.nextInt(100)+10;
            Color color = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
            if(rand.nextBoolean())
                shapes.add(new Circle(color, x,y,wOrR));
            else
                shapes.add(new Rectangle(color,x,y,wOrR,h));
        }
    }

    public void paintComponent(Graphics g) {
        for (Shape shape : shapes)
            shape.draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Test());

        frame.setVisible(true);
    }
}

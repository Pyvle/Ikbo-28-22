package Task_1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Line line;
    public Panel()  {
        line = new Line(25,150,78,2);
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line);
    }
}

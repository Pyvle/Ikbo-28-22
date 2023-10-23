package Task_1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout());

        Panel panel = new Panel();

        frame.add(panel);

        frame.setVisible(true);
    }
}
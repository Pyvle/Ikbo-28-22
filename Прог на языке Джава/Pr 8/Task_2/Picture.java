package Task_2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Picture extends JComponent {
    private Image image;

    public Picture(String path) {
        image = new ImageIcon(path).getImage();
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 0,0,null);
    }

    public static void main(String[] args) {
        String imagePath = args[0];
        JFrame frame = new JFrame("Picture");

        frame.setSize(929,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Picture(imagePath));

        frame.setVisible(true);
    }
}

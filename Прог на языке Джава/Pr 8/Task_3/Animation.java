package Task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame{
    private ImageIcon[] frames;
    private JLabel label;
    private int correntFrame = 0;

    public Animation() {
        frames = new ImageIcon[4];
        for (int i=0;i < frames.length;i++) {
            frames[i] = new ImageIcon("C:\\Users\\geenb\\IdeaProjects\\Pr_8\\src\\Task_3\\bolt" + i+".png");
        }
        label = new JLabel(frames[correntFrame]);
        add(label);

        Timer timer = new Timer(80, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                correntFrame = (correntFrame + 1)%frames.length;
                label.setIcon(frames[correntFrame]);
            }
        });
        timer.start();

        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        new Animation().setVisible(true);
    }
}

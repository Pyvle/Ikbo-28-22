import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Match extends JFrame{
    int a=0,b=0;
    String win = "DRAW";
    boolean ifEnd = false;
    JButton acMilan = new JButton("AC Milan");
    JButton realMadrid = new JButton("Real Madrid");
    JTextField result = new JTextField("Result: " + a + " X " + b,15);
    JTextField lScorer = new JTextField("Last Scorer: N/A",20);
    JTextField winner = new JTextField("Winner: DRAW",20);
    JButton endMatch = new JButton(("End match"));
    public Match() {
        super("AC Milan - Real Madrid");
        setSize(300,150);
        setLayout(null);
        acMilan.setBounds(0,0,150,20);
        realMadrid.setBounds(150,0,150,20);
        result.setBounds(0,20,300,20);
        lScorer.setBounds(0,40,300,20);
        winner.setBounds(0,60,300,20);
        endMatch.setBounds(100,90,100,20);
        add(acMilan);
        acMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!ifEnd) {
                    a++;
                    result.setText("Result: " + a + " X " + b);
                    lScorer.setText("Last Scorer: AC Milan");
                }
            }
        });
        add(realMadrid);
        realMadrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!ifEnd) {
                    b++;
                    result.setText("Result:" + a + " X " + b);
                    lScorer.setText("Last Scorer: Real Madrid");
                }
            }
        });
        add(result);
        add(lScorer);
        add(winner);
        add(endMatch);
        endMatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(a != b) {
                    ifEnd = true;
                    if (a > b)
                        winner.setText("Winner: AC Milan");
                    else
                        winner.setText("Winner: Real Madrid");
                }
            }
        });
    }
    public static void main(String[] args) {
        new Match().setVisible(true);
    }
}
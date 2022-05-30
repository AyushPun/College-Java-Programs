import javax.swing.*;
import java.awt.*;

public class Prog31 { // Border Layout
    JFrame f1;
    Prog31() {
        f1 = new JFrame();
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");
        f1.setLayout(new BorderLayout());
        f1.add(b1, BorderLayout.NORTH);
        f1.add(b2, BorderLayout.SOUTH);
        f1.add(b3, BorderLayout.EAST);
        f1.add(b4, BorderLayout.WEST);
        f1.add(b5, BorderLayout.CENTER);
        f1.setSize(300, 300);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new Prog31();
    }
}

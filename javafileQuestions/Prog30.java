import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Prog30 extends JFrame implements AdjustmentListener {
    JScrollBar s1, s2, s3;
    Prog30() {
        setLayout(new GridLayout(10, 1, 0, 10));
        s1 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 265);
        s2 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 265);
        s3 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 265);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        add(s1);
        add(s2);
        add(s3);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        int x, y, z;
        x = s1.getValue();
        y = s2.getValue();
        z = s3.getValue();
        Color c = new Color(x, y, z);
        getContentPane().setBackground(c);
    }
    public static void main(String[] a) {
        new Prog30();
    }
}

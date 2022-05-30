import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Prog26.class" width="300" height="300"></applet> */
public class Prog26 extends Applet implements ActionListener
{
    Label oneL = new Label("Choose only one from the following: ");
    Label twoL = new Label("Tick atleast one from the following: ");
    List l1 = new List(4,true);
    Checkbox c1 = new Checkbox("Blue color");
    Checkbox c2 = new Checkbox("Red color");
    Checkbox c3 = new Checkbox("Black color");
    Button b = new Button("Submit");
    String msg;
    public void init()
    {
        setBackground(Color.yellow);
        add(oneL);
        l1.add("S");
        l1.add("M");
        l1.add("L");
        l1.add("XL");
        add(l1);
        add(twoL);
        add(c1);
        add(c2);
        add(c3);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        if(s.equals("Submit"))
        {
            msg = "Thanks";
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,150,200);
    }
}

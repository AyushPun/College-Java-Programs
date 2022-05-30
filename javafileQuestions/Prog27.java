import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Prog27.class" width="1500" height="300"></applet> */
public class Prog27 extends Applet implements ActionListener
{
    Label l1 = new Label("Enter name: ");
    Label l2 = new Label("Enter eno: ");
    Label l3 = new Label("Enter mobile number: ");
    Label l4 = new Label("Enter designation: ");
    Label l5 = new Label("Enter salary: ");
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    TextField t3 = new TextField(20);
    TextField t4 = new TextField(20);
    TextField t5 = new TextField(20);
    Button b = new Button("Submit");
    String name,eno,mno,desig,sal;
    public void init()
    {
        setBackground(Color.YELLOW);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        if(s.equals("Submit"))
        {
            name = t1.getText();
            eno = t2.getText();
            mno = t3.getText();
            desig = t4.getText();
            sal = t5.getText();
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Details Are: ",150,200);
        g.drawString("Name: " + name,150,220);
        g.drawString("Eno: " + eno,150,240);
        g.drawString("Mobile: " + mno,150,260);
        g.drawString("Designation: " + desig,150,280);
        g.drawString("Salary: " + sal,150,300);
    }
}

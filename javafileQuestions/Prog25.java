import java.awt.*;
import java.applet.*;
/*
    <appled code = "Prog25.class" width="300" height="200"> 
    <param name=message value="Hello Beautiful World">
    </applet>
*/

public class Prog25 extends Applet implements Runnable {
    String msg;
    Thread t = null;
    int state;
    boolean stopFlag;
    public void init() {
        setBackground(Color.green);
        setForeground(Color.red);
    }
    public void start() {
        msg = getParameter("message");
        if(msg == null) 
            msg = "Hello World";
        msg = " " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    public void run() {
        char ch;
        for(;;) {
            try {
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if(stopFlag)
                    break;
            } catch(InterruptedException e) {System.out.println(e);}
        }
    }
    //Pause the banner
    public void stop() {
        stopFlag = true;
        t = null;
    }

    //display the banner
    public void paint(Graphics g) {
        g.drawString(msg, 50, 30);
    }
}
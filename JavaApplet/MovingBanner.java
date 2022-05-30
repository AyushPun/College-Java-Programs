import java.awt.*; // java Abstract Window Toolkit
import java.applet.*;
 /*
    <applet code="MovingBanner" width=300 height=50>
    <param name=message value="java makes the Web move!">
    </applet>
 */

 public class MovingBanner extends Applet implements Runnable {
    String msg;
    Thread t = null;
    int state;
    boolean stopFlag;

    //set colors and initialize thread
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }   

    //start thread
    public void start() {
        msg = getParameter("message");
        if(msg==null) 
            msg = "Message Not Found";
        msg = " " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }   

    //Entry point of the thread that runs the banner
    public void run() {
       char ch;
       //Display banner
       for(;;) {
        try {
            repaint();
            Thread.sleep(250);
            ch = msg.charAt(0);
            msg = msg.substring(1, msg.length());
            msg += ch;
            if(stopFlag) {
                break;
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
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
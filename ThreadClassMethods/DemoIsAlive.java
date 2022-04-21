class Count extends Thread {
    Count() {
        super("My Thread");
        System.out.println("Created :: " + this);
        start();
    }
    public void run() {
        try {
            for(int i=0; i<5; i++) {
                System.out.println("Count :: " + i);
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println("Exception Occured");
        }
    }
}
public class DemoIsAlive {
    public static void main(String[] args) {
        Count c = new Count();
        try {
            while(c.isAlive()) {
                System.out.println("Main Thread is alive tell Child is alive");
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Main Thread run is now over...");
    }
}

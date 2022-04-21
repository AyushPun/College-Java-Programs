class TestThread extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread :: " + Thread.currentThread());
        }
        else {
            System.out.println("User Thread :: " + Thread.currentThread());
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.setDaemon(true);;
        t1.start();
        t2.start();
    }    
}

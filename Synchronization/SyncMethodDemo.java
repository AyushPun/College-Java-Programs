class Power {
    synchronized public void printPower(int n) { //The object gets the lock when the synchronized method is called
        for(int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + " :: " + n + "^" + i + " => " + Math.pow(n, i));
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

class Thread1 extends Thread {
    Power p; 
    Thread1(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(2);
    }
}

class Thread2 extends Thread {
    Power p; 
    Thread2(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(5);
    }
}

public class SyncMethodDemo {
    public static void main(String[] args) {
        Power obj = new Power();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}

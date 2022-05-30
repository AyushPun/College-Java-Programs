class Power {
    synchronized static void printPower(int n) { //static synchronized method

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
        p.printPower(1);
    }
}
class Thread2 extends Thread {
    Power p; 
    Thread2(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(2);
    }
}
class Thread3 extends Thread {
    Power p; 
    Thread3(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(3);
    }
}
public class Prog21 {
    public static void main(String[] args) {
        Power obj = new Power();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        Thread3 t3 = new Thread3(obj);
        t1.start();
        t2.start();
        t3.start();
    }
}

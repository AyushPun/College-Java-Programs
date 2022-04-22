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
        p.printPower(3);
    }
}

class Thread2 extends Thread {
    Power p; 
    Thread2(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(4);
    }
}

class Thread3 extends Thread {
    Power p; 
    Thread3(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(5);
    }
}

class Thread4 extends Thread {
    Power p; 
    Thread4(Power p) {
        this.p = p;
    }
    public void run() {
        p.printPower(2);
    }
}

public class StaticSyncDemo {
    public static void main(String[] args) {
        Power obj1 = new Power();
        Power obj2 = new Power();
        Thread1 t1 = new Thread1(obj1);
        Thread2 t2 = new Thread2(obj1);
        Thread3 t3 = new Thread3(obj2);
        Thread4 t4 = new Thread4(obj2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

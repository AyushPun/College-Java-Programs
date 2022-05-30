class Thread1 extends Thread {
    int n;
    public void run() {
        System.out.println("----Table of 2----");
        n = 2;
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted\n" + e);
        }
    }
}
class Thread2 extends Thread {
    int n;
    public void run() {
        System.out.println("----Table of 3----");
        n = 3;
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted\n" + e);
        }
    }
}
class Thread3 extends Thread {
    int n;

    public void run() {
        System.out.println("----Table of 4----");
        n = 4;
        try {

            for (int i = 1; i < 6; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted\n" + e);
        }
    }
}
class Prog17 {
    public static void main(String[] args) {
        int n = 1;
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Number in main : " + n);
                n++;
                Thread.sleep(2000);
            }
        } catch (Exception e2) {
            System.out.println("Thread Interrupted!\n" + e2);
        }
    }
}

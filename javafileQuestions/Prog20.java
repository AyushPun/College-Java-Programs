public class Prog20 extends Thread {
    public void run() {
        System.out.println("Inside run() method");
    }
    public static void main(String args[]) {
        Prog20 t1 = new Prog20();
        Prog20 t2 = new Prog20();
        Prog20 t3 = new Prog20();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(5);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of the thread t1 is : " + t1.getPriority());
        System.out.println("Priority of the thread t2 is : " + t2.getPriority());
        System.out.println("Priority of the thread t3 is : " + t3.getPriority());
    }
}

class TestPriorityMin extends Thread {
    public void run() {
        try{
            for(int i=1; i<=3; i++) {
                System.out.println("Running Thread Name :: " + Thread.currentThread().getName() + " , Its Priority :: " + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

class TestPriorityMax extends Thread {
    public void run() {
        try{
            for(int i=1; i<=3; i++) {
                System.out.println("Running Thread Name :: " + Thread.currentThread().getName() + " , Its Priority :: " + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}


public class SetThreadPriority {
    public static void main(String[] args) {
        TestPriorityMin m1 = new TestPriorityMin();
        TestPriorityMax m2 = new TestPriorityMax();
        m1.setName("Min");
        m2.setName("Max");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}

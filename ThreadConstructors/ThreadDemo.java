//Types of Thread Class Constructors
// Thread()
// Thread(String name)
// Thread(Runnable target)
// Thread(Runnable target, String name)

class MyThread extends Thread {
    MyThread(){}
    MyThread(String str) {
        super(str);
    }

    public void run() {
        try {
            for(int i=1; i<=3; i++) {
                System.out.println("Name :: " + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }   catch(InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        
    }
}

class MyRunnableThread implements Runnable {

    @Override
    public void run() { 
        System.out.println("Running Thread Name :: " + Thread.currentThread().getName());
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread("My Thread");
        t2.start();
        Thread t3 = new Thread(new MyRunnableThread());
        t3.start();
        Thread t4 = new Thread(new MyRunnableThread(), "My Runnable Thread");
        t4.start();
    }
}

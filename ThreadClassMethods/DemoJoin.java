class A extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("A Thread :: " + i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("B Thread :: " + i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

class C extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("C Thread :: " + i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

public class DemoJoin {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        try {
            a.join();
        } catch(Exception e) {
            System.out.println("Exception Occured");
        }
        new B().start();
        new C().start();
        for(int i=1; i<=5; i++) {
            System.out.println("Main Thread");
            try {
                Thread.sleep(2000);
            } catch(Exception e) {
                System.out.println("Exception Occured");
            }
        }
    }
}

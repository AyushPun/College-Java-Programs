class TwoChildThread {
    public static void main(String... arg) {
      FirstThread t1 = new FirstThread();
      t1.start();
      SecondThread t2 = new SecondThread();
      t2.start();
    }  
  }
  
  class FirstThread extends Thread{
    public void run() {
      try {
        for(int i=0; i<10; i++) {
          System.out.println("Ayush Pun");
          Thread.sleep(1000);
        }
      }
      catch(InterruptedException e) {
        System.out.println("First Thread Interrupted");
      }
    }
  }
  
  class SecondThread extends Thread{
    public void run() {
      try {
        for(int i=1; i<=5; i++) {
          System.out.println("2 * " + i + " = " + (2*i));
          Thread.sleep(1000);
        }
      }
      catch(InterruptedException e) {
        System.out.println("Second Thread Interrupted");
      }
    }
  }
class ChildThread extends Thread{
    public void run() {
      try {
          System.out.println("Thread ID :: "+ Thread.currentThread().getName());
      }
      catch(Exception e) {
        System.out.println("Child Thread Interrupted");
      }
    }
  }
  
  class ThreadSpawning{
      public static void main(String... arg){
          ChildThread t1 = new ChildThread();
          ChildThread t2 = new ChildThread();
          ChildThread t3 = new ChildThread();
          ChildThread t4= new ChildThread();
          ChildThread t5 = new ChildThread();
          t1.start();
          t2.start();
          t3.start();
          t4.start();
          t5.start();
    }
  }
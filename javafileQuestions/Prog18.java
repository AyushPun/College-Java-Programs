class ChildThread extends Thread {
    public void run() {
      try {
        System.out.println(
            "Thread Name :: " + Thread.currentThread().getName() + "\t\tId => " + Thread.currentThread().getId());
      } catch (Exception e) {
        System.out.println("Child Thread Interrupted");
      }
    }
  }
  class Prog18 {
    public static void main(String... arg) {
        (new ChildThread()).start();
        (new ChildThread()).start();
        (new ChildThread()).start();
        (new ChildThread()).start();
        (new ChildThread()).start();
    }
  }
class TestThread extends Thread{
    @Override
    public void run() {
      try {
        for(int i=1; i<=5; i++) {
          System.out.println("Current Thread :: " + this.getName());
          Thread.sleep(1000);
        }
      } catch(Exception e) {
        System.out.println("Exception Occured");
      }
    }
  }
  
  public class DemoJoinTime {
    public static void main(String... arg) {
      TestThread t1 = new TestThread();
      TestThread t2 = new TestThread();
      TestThread t3 = new TestThread();
  
      t1.start();
      try {
        t1.join(3000);
        System.out.println("");
        t2.start();
        t3.start();
      } catch(Exception e) {
        System.out.println("Exception Occured");
      }
    }  
  }
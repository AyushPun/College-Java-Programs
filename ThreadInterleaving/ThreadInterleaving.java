class MyThread extends Thread{
    public void run(){
      try{
        for(int i=0;i<5;i++){
          System.out.println("Child Thread");
          Thread.sleep(1000);
        }
      }
      catch(InterruptedException e){
        System.out.println("Child Thread Interrupted");
      }
    }
  }
  
  class ThreadInterleaving{
      public static void main(String... arg){
          MyThread t = new MyThread();
          t.start();
          try{
              for(int i=0;i<5;i++){
                  System.out.println("Main Thread");
                  Thread.sleep(1000);
              }
          }
          catch(InterruptedException e){
              System.out.println("Main Thread Interrupted");
          }
      }
  }
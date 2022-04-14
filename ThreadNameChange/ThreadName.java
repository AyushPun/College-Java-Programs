class ThreadName{
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread :: " + t);
        t.setName("Java");
        System.out.println("New Name For Current Thread :: " + t);
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
    }
}
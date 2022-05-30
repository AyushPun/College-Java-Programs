class Customer {
    int amount = 1000;

    synchronized void withdraw(int amount) {
        System.out.println("Going To Withdraw...");
        if(this.amount < amount) {
            System.out.println("LESS BALANCE, waiting for Deposit");
            try{wait();} catch(Exception e) {
                System.out.println(e);
            }
        }
        this.amount-=amount;
        System.out.println("Withdraw Completed");
    }
    
    synchronized void deposit(int amount) {
        System.out.println("Going To Deposit...");
        this.amount+=amount;
        System.out.println("Deposit Completed");
        notify();
    }
        
    
}

class InterThreadCommunication {
    public static void main(String... args) {
        final Customer Ayush = new Customer();
        new Thread(){
            public void run() {
                Ayush.withdraw(150000);
            }
        }.start();
        new Thread(){
            public void run() {
                Ayush.deposit(100000);
            }
        }.start();
    }
}
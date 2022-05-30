import java.util.*;
class Prog3 {
    Prog3() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number to print its Table and Factorial = ");
        int n = inp.nextInt();
        table(n);
        factorial(n);
        inp.close();
    }   
    void table(int n) {
        System.out.println("---------Table of '" + n + "' ---------");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
    void factorial(int n) {
        int fac = 1;
        for(int i=1; i<=n; i++)
        {
            fac *= i;
        }
        System.out.println("\nFactorial of " + n +" :: " + fac);  
    }
    public static void main(String[] args) {
        new Prog3();
    }
}

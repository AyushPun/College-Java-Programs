import java.util.Scanner;
class LoanDenied extends Exception {
    public String toString() {
        return "You're not eligible for loan";
    }
}
public class Prog16 {
    static void checkLoan(int sal) throws LoanDenied {
        if(sal <= 70000) 
            throw new LoanDenied();
        else
            System.out.println("You're eligible for loan");
    }
    public static void main(String[] args) {
        String name;
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        System.out.print("Enter Your Salary : ");
        salary = sc.nextInt();
        System.out.println("\nName : " + name);
        System.out.println("Salary : " + salary);
        try {checkLoan(salary);}
        catch(LoanDenied e) {System.out.println(e);}
        sc.close();
    }
}
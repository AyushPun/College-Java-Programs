import java.io.*;
public class Prog15 {
    public static void main(String[] args) throws IOException {
        try {
            try {
                throw new java.io.IOException(); // Checked exception
            } catch (Exception e) {
                System.out.println(e);
            }

            int a = 10, b = 0;
            int res = a / b;
            System.out.println("Result = " + res); // Unchecked exception
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Demonstration of unchecked & checked exceptions completed!");
    }
}

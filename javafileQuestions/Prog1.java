import java.util.*;
class Prog1 {
    public static void main(String... args) {
        double ans = 0.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Value Of n = ");
        double n = inp.nextDouble();
        System.out.print("\n1");
        for(double i=1; i<=n; i++) {
            System.out.print(" + 1/" + i);
            ans += 1/i;
        }
        System.out.println(" = " + ans);
        inp.close();
    }
}
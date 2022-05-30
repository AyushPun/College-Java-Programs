import java.util.*;
class shape_details {
    final double pi = 3.14;

    void volume(int r) {
        System.out.println("Volume of the Sphere :: " + (4 * pi * r * r * r) / 3);
    }

    void volume(int r, float h) {
        System.out.println("Volume of the Cone :: " + (pi * r * r * h) / 3);
    }

    void volume(int r, double h) {
        System.out.println("Volume of the Cylinder :: " + (pi * r * r * h));
    }
}
public class Prog5 {
    public static void main(String[] args) {
        int r;
        float h;
        double h1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        r = sc.nextInt();
        System.out.print("Enter the value of height: ");
        h = sc.nextFloat();
        shape_details s = new shape_details();
        s.volume(r);
        h1 = h; // widening typcasting
        s.volume(r, h);
        s.volume(r, h1);
        sc.close();
    }
}

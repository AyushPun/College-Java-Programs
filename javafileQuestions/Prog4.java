import java.util.Scanner;
class Prog4 {
    static int a[][] = new int[3][3];
    static void input() {
        System.out.print("Enter elements of 3X3 array = ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        sc.close();
    }
    static void output() {
        System.out.println("\nElements of 3X3 array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
    public static void main(String args[]) {
        input();
        output();
    }
}

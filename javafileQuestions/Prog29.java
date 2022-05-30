import java.util.Scanner;
public class Prog29 {
    public static void main(String args[]) {
        final int SIZE = 10;
        String names[] = new String[SIZE];
        System.out.println("Enter " + SIZE + " names");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter Name: ");
            names[i] = (new Scanner(System.in)).nextLine();
        }
        // Selection Sort
        for (int i = 0; i < SIZE - 1; i++) {
            int min = i;
            for (int j = i + 1; j < SIZE; j++) {
                if (names[j].compareToIgnoreCase(names[min]) < 0) {
                    min = j;
                }
            }
            String temp = names[min];
            names[min] = names[i];
            names[i] = temp;
        }
        System.out.println("--Dictionary--");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(names[i]);
        }
    }
}

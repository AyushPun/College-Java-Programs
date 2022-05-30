import java.io.*;
import java.util.*;

public class Prog23 {
    void writeByte() {
        System.out.print("Enter the name of SuperHero :: ");
        String str = (new Scanner(System.in)).nextLine();
        byte b[] = str.getBytes();
        FileOutputStream ofile = null;
        try {
            ofile = new FileOutputStream("tempHero.txt");
            ofile.write(b);
            ofile.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Done using ByteStream");
    }
    void writeChar() { 
        System.out.print("Enter the name of SuperVillian :: ");
        String str = (new Scanner(System.in)).nextLine();
        char c[] = new char[(int) str.length()];
        FileWriter ofile = null;
        try {
            ofile = new FileWriter("tempVillain.txt");
            ofile.write(c);
            ofile.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Done using Character Stream");
    }
    public static void main(String[] args) {
        System.out.println("--------MENU--------");
        System.out.println("1. Write into a file using ByteStream.");
        System.out.println("2. Write into a file using Character Stream.");
        System.out.println("3. Exit");
        System.out.print("Enter your option : ");
        int choice = (new Scanner(System.in)).nextInt();
        switch (choice) {
            case 1:
                (new Prog23()).writeByte();
                break;
            case 2:
                (new Prog23()).writeChar();
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(-1);
                break;
            default:
                System.out.println("Wrong Input!!");
                System.exit(-1);
        }
    }
}

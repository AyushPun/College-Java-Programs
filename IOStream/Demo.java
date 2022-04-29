// WAP to read characters from the keyboard using BufferedReader.
// WAP to read strings from the keyboard. String readLine() method of BufferedReader.
// WAP to write console output. (System.out.write is to be used to print few characters from a byte array)
// WAP to demonstrate the use of PrintWriter class.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nInput String :: ");
        String data1 = br.readLine();    //Reading String

        System.out.print("\nInput Character :: ");
        char data2 = (char)br.read();    //Reading Character
        
        System.out.print("\nEntered String :: " + data1);
        System.out.print("\nEntered Character :: " + data2);

        byte ByteArray[] = {65, 66, 67, 68, 69};
        System.out.print("\nPrinting Characters from ByteArray using 'System.out.write' :: ");
        System.out.write(ByteArray, 0, 3);  //System.out.write

        PrintWriter pw = new PrintWriter(System.out, true); //PrintWriter class
        pw.println("\n\n--This is a String--");
        int i = -2;
        pw.println(i);
        double d = 2.3e-7;
        pw.println(d);
    }
}
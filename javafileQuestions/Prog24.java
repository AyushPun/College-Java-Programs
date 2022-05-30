import java.io.*;

public class Prog24 {
    void copyChar() {
        File t1 = new File("t1.txt");
        File t2 = new File("t2.txt");
        FileReader fin = null;
        FileWriter fout = null;
        try {
            fin = new FileReader(t1);
            fout = new FileWriter(t2);
            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            fin.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File copied using CharacterStream is successfuly done!");
    }

    void copyByte() {
        byte byteRead = 0;
        File t3 = new File("t3.txt");
        File t4 = new File("t4.txt");
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(t3);
            fout = new FileOutputStream(t4);
            while(byteRead != -1) {
                byteRead = (byte) fin.read();
                fout.write(byteRead);
            }
            fin.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File copied using ByteStream is successfuly done!");
    }

    public static void main(String[] args) {
        (new Prog24()).copyChar();
        (new Prog24()).copyByte();
    }
}
import java.io.*;
public class CharStream {
  public static void main(String... arg) throws IOException {
    FileInputStream fin = null;
    FileOutputStream fout = null;

    try {
      int temp;
      fin = new FileInputStream("t1.txt");
      fout = new FileOutputStream("t2.txt");
      while((temp = fin.read()) != -1) {
        fout.write((char)temp);
       System.out.println((char)temp);   
      }
    }
    finally {
      if(fin != null) {
        System.out.println("Closing...");
        fin.close();
      }
      if(fout != null) {
        fout.close();
      }
    }
  }
}
import java.io.*;
public class ByteStream {
  public static void main(String... arg) throws IOException {
    FileInputStream fin = null;
    FileOutputStream fout = null;

    try {
      int temp;
      fin = new FileInputStream("t1.txt");
      fout = new FileOutputStream("t2.txt");
      while((temp = fin.read()) != -1) {
        fout.write((byte)temp);
        //Displaying On screen
        System.out.print((byte)temp);
      }
    }
    finally {
      if(fin != null) {
        fin.close();
      }
      if(fout != null) {
        fout.close();
      }
    }
  }
}
import java.io.*;
public class CharStream {
  public static void main(String... arg) throws IOException {
    FileReader fin = null;
    FileWriter fout = null;

    try {
      int temp;
      fin = new FileReader("t1.txt");
      fout = new FileWriter("t2.txt");
      while((temp = fin.read()) != -1) {
        fout.write((char)temp);
        //Displaying on the screen
       System.out.print((char)temp);   
      }
    }
    finally {
      if(fin != null) {
        System.out.println("\nClosing...");
        fin.close();
      }
      if(fout != null) {
        fout.close();
      }
    }
  }
}
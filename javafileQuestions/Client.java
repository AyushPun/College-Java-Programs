import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
    private Socket socket = null;
    private Scanner input = new Scanner(System.in);
    private DataOutputStream out = null;
    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }
        String line = "";
        System.out.println();

        while (!line.equals("Over")) {
            try {
                line = input.nextLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
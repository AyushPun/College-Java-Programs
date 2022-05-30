interface vehicle {
    void display();
}
class car implements vehicle {
    String vname = "BMW";
    public void display() {
        System.out.println("Name of the car :: " + vname);
    }
}
class bike implements vehicle {
    String vname = "Pulsar";
    public void display() {
        System.out.println("Name of the bike :: " + vname);
    }
}
public class Prog11 {
    public static void main(String[] args) {
        new car().display();
        new bike().display();
    }
}

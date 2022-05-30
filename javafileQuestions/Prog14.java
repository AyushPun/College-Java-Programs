interface A {
    void display_name();
}
interface B extends A {
    void display_roll();
}
class C implements B {
    int roll = 23;
    String name = "Ayush Pun";

    public void display_name() {
        System.out.println("Name :: " + name);
    }

    public void display_roll() {
        System.out.println("Roll No. :: " + roll);
    }
}
public class Prog14 {
    public static void main(String[] args) {
        new C().display_name();
        new C().display_roll();
    }
}

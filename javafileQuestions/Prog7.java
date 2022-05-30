class Base {
    int x = 10;
    void output() {
        System.out.println("Calling Base Class method");
    }
}
class Derived extends Base {
    int x = 20;
    void output() {
        super.output();
        System.out.println("Value of X in Derived Class: " + x);
        System.out.println("Value of X in Base Class: " + super.x);
    }
}
class Prog7{
    public static void main(String args[]) {
        Derived d = new Derived();
        d.output();
    }
}

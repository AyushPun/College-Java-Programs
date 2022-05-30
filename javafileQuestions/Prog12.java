abstract class Base {
    Base() {System.out.println("Base Class Constructor Invoked");}
}
class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived Class Construtor Invoked");
    }
}
class Prog12 {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

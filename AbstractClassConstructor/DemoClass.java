// WAP to demonstrate constructors in abstract base class
abstract class Base {
    Base() {System.out.println("Base Class Constructor Invoked");}
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived Class Construtor Invoked");
    }
}
class DemoClass {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

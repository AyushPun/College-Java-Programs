// WAP to demonstrate final method in abstract base class
abstract class Base {
    final void func() {
        System.out.println("Final Method Called");
    }
}

class Derived extends Base {}

public class DemoClass {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.func();
    }
}

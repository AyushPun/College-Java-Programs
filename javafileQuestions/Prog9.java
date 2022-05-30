class Base {
    int x = 10;
    void display() {
        System.out.print("\nInside Base class");
    }
}
class Derived extends Base {
    int x = 20;
    void display() {
        System.out.print("\nInside Derived class");
    }
}
class Prog9 {
    public static void main(String... arg) {
        Base b = new Base();
        Derived d = new Derived();
        Base b_ref;
        b_ref = b;
        b_ref.display();
        b_ref = d;
        b_ref.display();
        System.out.print("\nValue of x inside Base class :: " + b_ref.x); //dmd doesn't work for variables
    }
}
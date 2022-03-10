// Multilvl inheritance with protected modifier

class Grand {
    protected int a=10;
    void message() {
        System.out.print("\nInside Grand Class");
    }
}

class Parent extends Grand {
    int b = a * a;
    void message() {
        super.message();
        System.out.print("\nInside Parent Class");
        System.out.print("\nSquare of 'a' :: " + b);
    }
}

class Child extends Parent {
    void message() {
        super.message();
        System.out.print("\nInside Child Class");
        System.out.print("\nCube of 'a' :: " + a*a*a);
    }
}

class MultilvlInheritance {
    public static void main(String... args) {
        Child obj1 = new Child();
        obj1.message();
        System.out.print("\nValue of 'a' :: " + obj1.a);
        // System.out.print("\nValue of 'b' :: " + obj1.b);
    }
}

class A {
    B obj;
    A(B obj) {
        this.obj = obj;
        obj.display();
    }
}

class B {
    int x = 10;
    B() {
        A obj = new A(this);
    }
    void display() {
        System.out.println("Value of 'x' in class B :: " + x);
    }
}

class Demo {
    public static void main(String... arg) {
        B obj = new B();
    }
}

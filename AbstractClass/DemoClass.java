// Create an abstract class with an abstract method. Calculate(int i) Inherit this by 3 different classes to calculate square, square root and cube

abstract class Arithmetic {
    abstract void Calculate(int i);
} 

class A extends Arithmetic {
    void Calculate(int s) {
        System.out.println("Square of '" + s + "' :: " + Math.pow(s, 2));
    }
}

class B extends Arithmetic {
    void Calculate(int r) {
        System.out.println("Square Root of '" + r + "' :: " + Math.sqrt(r));
    }
    
}

class C extends Arithmetic {
    void Calculate(int c) {
        System.out.println("Cube of '" + c + "' :: " + Math.pow(c, 3));
    }

}

class DemoClass {
    public static void main(String[] args) {
        A obj1 = new A(); 
        obj1.Calculate(20);
        B obj2 = new B(); 
        obj2.Calculate(144);
        C obj3 = new C(); 
        obj3.Calculate(7);
    }
}

// Simple inheritance. Method Overiding. class A and class B 
// using display method display variable x from both classes.

class A {
    int x = 10;
    void display() {
      System.out.print("\nValue of 'x' inside class A :: " + x);
    }
  }
  
  class B extends A {
    int x = 20;
    void display() {
      super.display();
      System.out.print("\nValue of 'x' inside class B :: " + x);
    }
  }
  
  class Super {
    public static void main(String... args) {
      B objB = new B();
    objB.display();
    }
  }
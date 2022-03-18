class Base {
    int a = 2;
    void display() {
      System.out.print("\nFrom Base class");
    }
  }
  
  class Derived extends Base {
    int a = 10;
    void display() {
      System.out.print("\nFrom Derived class");
      super.display();
    }
    void show() {
      System.out.print("\nFrom show of Derived class");
      System.out.print("\nValue of 'a' inside Derived class :: " + a);
      System.out.print("\nValue of 'a' from Super(Base) class :: " + super.a);
    }
  }
  class MethodOveriding {
    public static void main(String... a) {
      Derived d = new Derived();
      d.display();
      d.show();
    }
  }
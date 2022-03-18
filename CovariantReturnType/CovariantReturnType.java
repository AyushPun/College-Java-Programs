class Animal {
    Animal func() {
      System.out.print("\nInside Animal(Base) Class");
      return new Animal();
    }
  }
  
  class Cat extends Animal {
    Cat func() {
      System.out.print("\nInside Cat(Derived) Class");
      return new Cat();
    }
  }
  class CovariantReturnType {
    public static void main(String... a) {
      new Animal().func();
      new Cat().func();
    }
  }
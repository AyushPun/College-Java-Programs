// Use constructor overloading for circle class. Write area
// () func to calculate circle's area.

class Box {
  int w, h, d;

  // default constructor
  Box() {
    w = 10;
    h = 20;
    d = 30;
  }

  // parametarize constructor
  Box(int w, int h, int d) {
    this.w = w;
    this.h = h;
    this.d = d;
  }

  // copy constructor
  Box(Box obj) {
    this.w = obj.w;
    this.h = obj.h;
    this.d = obj.d;
  }

  void volume() {
    System.out.println("Volume of the Box :: " + w * h * d + " cubic cm");
  }
}

class ConstructorOverloading {
  public static void main(String... args) {
    Box b1 = new Box();
    b1.volume();
    Box b2 = new Box(1, 2, 3);
    b2.volume();
    Box b3 = new Box(b1);
    b3.volume();
  }
}
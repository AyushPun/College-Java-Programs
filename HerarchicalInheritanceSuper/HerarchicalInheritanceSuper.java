// Inheritance Room {lenght, height, Room(), Room(int l, int 
// w), area()} inherited by StudyRoom {no. of study tables, 
// StudyRoom(), StudyRoom(int l, int w, int h, int 
// no.ofstudyTables), Volume()} and diningRoom{no. of dining 
// chairs}

class Room {
    int l, h, w;
    Room() {};
    Room(int l, int w, int h) {
      this.l = l;
      this.w = w;
      this.h = h;
    }
    void area() {
      System.out.print("\nArea of the Room :: " + l*w);
    }
  }
  
  class StudyRoom extends Room {
    int no_of_studyTables;
    StudyRoom() {super();};
    StudyRoom(int l, int w, int h, int n) {super(l, w, h); no_of_studyTables = n;};
    void volume() {
      System.out.print("\nVolume of StudyRoom :: " + l*w*h);
    }
  }
  
  class DiningRoom extends Room {
    int no_of_diningTables;
    DiningRoom() {super();};
    DiningRoom(int l, int w, int h, int n) {super(l, w, h); no_of_diningTables = n;};
    void volume() {
      System.out.print("\nVolume of DiningRoom:: " + l*w*h);
    }
  }
  
  class HerarchicalInheritanceSuper {
    public static void main(String... args) {
      StudyRoom s = new StudyRoom(10, 20, 30, 40);
      s.volume();
      s.area();
      DiningRoom d = new DiningRoom(100, 200, 300, 50);
      d.volume();
      System.out.print("\nNumber of Dining Tables :: " + d.no_of_diningTables);
    }
  }
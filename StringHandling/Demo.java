// WAP to construct a string from a subset of char array.
// WAP to demonstrate overriding of toString() from base class.

class Student {
    private int rno;
    private String name;
    public Student(int r, String n) {
       rno = r;
       name = n;
    }
    public String toString() {
       return rno + " " + name;
    }
 }

class Demo {
    public static void main(String args[]) {
        char[] ch = {'A', 'Y', 'U', 'S', 'H'};
        String str = String.copyValueOf(ch, 1, 3);
        System.out.println(str);

        Student s = new Student(23, "Ayush Pun");
        System.out.println("Student Details :: " + s);
    }
  }
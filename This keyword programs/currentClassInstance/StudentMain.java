class Student {
    int enrol; String name;
    Student(int enrol, String name) {
        this.enrol = enrol;
        this.name = name;
    }
    Student get() {
        return this;
    }
    void display() {
        System.out.print("\nName: " + name + "\nEnrollment No. : " + enrol);
    }
}
class StudentMain {
    public static void main(String... arg) {
        Student s = new Student(023, "Ayush");
        s.get().display();

        // Student s1 = new Student();
        // s1 = s.get();
        // s1.display();
    }
}

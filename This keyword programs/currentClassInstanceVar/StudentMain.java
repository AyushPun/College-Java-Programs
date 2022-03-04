class Student {
  int age; String name;
  Student(int age, String name) {
	this.age = age;
	this.name = name;
	System.out.print("\nName : " + name + "\nAge : " + age);
  }
}

class StudentMain {
	public static void main(String... arg) {
			Student s = new Student(19, "Ayush Pun");
	}
}
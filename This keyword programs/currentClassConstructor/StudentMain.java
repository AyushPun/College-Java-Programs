class Student {
	String name;
	int enrol;
	
	Student() {
		this("Ayush", 023);                
		System.out.print("\n--------Inside Default Constructor--------");
	}
	
	Student(String name, int enrol) {
		this.name = name;
		this.enrol = enrol;
		System.out.print("\n--------Inside Parameterize Constructor--------");
		System.out.print("\nName: " + name + "\nEnrollment No. : " + enrol);
	}
}

class StudentMain {
	public static void main(String arg[]) {
		Student s = new Student();
	}
}
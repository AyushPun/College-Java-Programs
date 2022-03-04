import java.util.Scanner;

class Student {
	String name;
	long enrolno, mobile;
	double percentage;
	
	void input() {
		Scanner input_scan = new Scanner(System.in);
		System.out.print("Input Student Name : ");
		name = input_scan.nextLine();
		System.out.print("Input Enrollment No. : ");
		enrolno = input_scan.nextLong();
		System.out.print("Input Mobile No. : ");
		mobile = input_scan.nextLong();
		System.out.print("Input Percentage : ");
		percentage = input_scan.nextDouble();
		input_scan.close();
	}

	
	void output() {
		System.out.println("----------------------------");
		if(percentage >= 60) {
			System.out.println(name + " Got first Division");
		} else if(percentage >= 50 && percentage < 60) {
			System.out.println(name + " Got Second Division");
		} else if(percentage < 50) {
			System.out.println(name + " Got Third Division");
		}
		System.out.print("----------------------------");
	}
}

class Stud_main {
	public static void main(String args[]) {
		Student s = new Student();
		s.input();
		s.output();
	}
}
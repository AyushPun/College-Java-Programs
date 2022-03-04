import java.util.Scanner;

class Employee {
	String emp_name;
	int age;
	double basic_pay;
	double gross_sal;
	
	void input() {
		Scanner input_scan = new Scanner(System.in);
		System.out.print("Input Employee Name : ");
		emp_name = input_scan.nextLine();
		System.out.print("Input Employee Age : ");
		age = input_scan.nextInt();
		System.out.print("Input Employee Basic Pay : ");
		basic_pay = input_scan.nextDouble();
		input_scan.close();
	}
	
	void output(){
		gross_sal = basic_pay + (0.3*basic_pay) + (1.2*basic_pay);
		System.out.println("Employee Name : " + emp_name);
		System.out.print("Gross Salaray : " + gross_sal);
	}
}

class EmployeeDetails {
	public static void main(String args[]) {
		Employee e = new Employee();
		e.input();
		e.output();
	}
}
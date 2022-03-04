import java.util.Scanner;
class Rectangle {
	int l, b;
	void input() {
		Scanner input_scan = new Scanner(System.in);
		System.out.print("Input Length : ");
		l = input_scan.nextInt();
		System.out.print("Input Breath : ");
		b = input_scan.nextInt();
		input_scan.close();
	}
	void output() {
		System.out.print("Area of rectangle : " + l*b);
	}
}

class Rect_main {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.input();
		r.output();
	}
}
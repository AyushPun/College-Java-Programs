import java.lang.Math;
class cylinder{
	public static void main(String arg[]) {
		final double pie = 3.14;
		int radius = 5;
		int height = 10;
		double volume = Math.pow(radius, 2) * height;
		System.out.print("Volume of cylinder : " + volume + " cubic units");
	}
}
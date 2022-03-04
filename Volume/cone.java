import java.lang.Math;
class cone {
	public static void main(String arg[]) {
		final double pie = 3.14;
		int radius = 5;
		int height = 10;
		double volume = (pie * Math.pow(radius, 2) * height)/3;
		System.out.print("Volume of Cone : " + volume + "cubic units");
	}
}
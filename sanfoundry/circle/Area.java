package circle;

import java.util.Scanner;

public class Area {
	double area;

	Area(double r) {
		area = (22 * r * r) / 7;

	}
}

class AreaOfCircle2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad = s.nextDouble();
		Area a = new Area(rad);
		System.out.println("Area of Circle is: " + a.area);
	}
}
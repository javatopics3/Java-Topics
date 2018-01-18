package circle;

import java.util.Scanner;

public class AreaOfCircle5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad = s.nextDouble();
		double a = area(rad);
		System.out.println("Area of Circle is: " + a);
	}

	static double area(double r) {
		return (22 * r * r) / 7;
	}
}

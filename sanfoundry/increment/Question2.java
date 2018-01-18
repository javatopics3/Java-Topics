package increment;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) throws IOException {
		float salary;
		double increment;
		Scanner scanner = new Scanner(new InputStreamReader(System.in));

		System.out.print("Enter Your Salary:");

		salary = scanner.nextFloat();

		if ((salary >= 800) && (salary <= 1000))

		{
			increment = (2 / salary) * 100;
			System.out
					.println("\nPercentage increment is: " + increment + "\n");
		} else if ((salary >= 101) && (salary <= 2000)) {
			increment = (5 / salary) * 100;
			System.out
					.println("\nPercentage increment is: " + increment + "\n");
		} else if ((salary >= 201) && (salary <= 4000)) {
			increment = (8 / salary) * 100;
			System.out
					.println("\nPercentage increment is: " + increment + "\n");
		} else if (salary > 400) {
			increment = (10 / salary) * 100;
			System.out
					.println("\nPercentage increment is: " + increment + "\n");
		} else
			System.out.println("\nNo More Increment For This Salary\n");

	}
}

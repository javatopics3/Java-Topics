package comission;

import java.util.Scanner;

public class CalculateCommission3 {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter amount:");

		double amount = sc.nextDouble();

		System.out.print("Enter commissionPercentage:");

		double commissionPercentage = sc.nextDouble();

		double commission = calculateCommission(amount, commissionPercentage);

		System.out.println("Commission amount=" + commission);

	}

	static double calculateCommission(double x, double y) {
		return (y / 100) * x;
	}
}

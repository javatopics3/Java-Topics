package comission;

import java.util.Scanner;

class Calculate {
	double res;

	Calculate(double x, double y)

	{
		res = (y / 100) * x;
	}

}

class CalculateCommission000 {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter amount:");

		double amount = sc.nextDouble();

		System.out.print("Enter commissionPercentage:");

		double commissionPercentage = sc.nextDouble();

		Calculate commission = new Calculate(amount, commissionPercentage);

		System.out.println("Commission amount=" + commission.res);

	}
}
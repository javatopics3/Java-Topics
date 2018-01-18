package Discount;

public class Disc4 {
	public static void main(String args[]) {

		double dis, amount, markedprice, s;

		markedprice = Double.parseDouble(args[0]);

		dis = Double.parseDouble(args[1]);

		System.out.println("markedprice= " + markedprice);

		System.out.println("discount rate=" + dis);

		s = 100 - dis;

		amount = calcuateDiscount(markedprice, s);

		System.out.println("amount after discount=" + amount);

	}

	static double calcuateDiscount(double markedprice, double s) {
		double amount = (s * markedprice) / 100;

		return amount;

	}
}

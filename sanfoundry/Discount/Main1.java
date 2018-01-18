package Discount;

import java.util.Scanner;

public class Main1 {
	/**
	 * Utility function to print a line
	 * 
	 * @param line
	 *            : line to print
	 */
	static void print(String line) {
		System.out.println(line);
	}

	static int findFinalPrice(int price, int discount) {
		return (price * discount) / 100;
	}

	public static void main(String[] args) {
		int price;
		int discount;
		Scanner sc = new Scanner(System.in);
		print("Enter price of the product :");
		price = sc.nextInt();
		print("Enter Discount of the product :");
		discount = sc.nextInt();
		print("Final price is " + findFinalPrice(price, discount));
	}
}

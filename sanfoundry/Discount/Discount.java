package Discount;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		int listPrice;
		int discount;
		int discountPrice;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter list price in cents: ");
		listPrice = scan.nextInt();

		System.out.print("Enter discount in percent: ");
		discount = scan.nextInt();

		discountPrice = listPrice - (listPrice * discount) / 100;

		System.out.println("Discount Price: " + discountPrice);
	}
}

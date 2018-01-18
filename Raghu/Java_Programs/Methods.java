package Java_Programs;

import java.io.IOException;
import java.util.Scanner;

public class Methods {
	private static int qoh;

	public static void main(String args[]) throws IOException {

		while (!tryProcessLine()) {
			System.out.println("error... Trying again");
		}

		System.out.println("succeeded! Result: " + qoh);

	}

	public static boolean tryProcessLine() {

		String input = "";

		Scanner keyboard = new Scanner(System.in);

		System.out.print("\nEnter Quantity on Hand: ");

		input = keyboard.nextLine();

		try {
			qoh = Integer.valueOf(input);

			if (qoh < 0 || qoh > 500) {
				System.out
						.println("\n**ERROR06** - Quantity on hand must be between 0 and 500");
				return false;
			} else {
				return true;
			}
		} catch (NumberFormatException e) {
			System.out
					.println("\n**ERROR06** - Quantity on hand must be numeric");
			return false;
		}
	}
}

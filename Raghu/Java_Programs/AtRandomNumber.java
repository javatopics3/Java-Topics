package Java_Programs;

//This Java program generates random numbers within the provided range.
/*
 * Scanner class and Random class is a part of java.util package, 
 * so we required to import this package 
 * in our Java program. 
 */
import java.util.Random;
import java.util.Scanner;

public class AtRandomNumber {
	public static void main(String[] args) {
		int maxRange;

		// create objects
		Scanner SC = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Please enter maximum range: ");
		maxRange = SC.nextInt();

		for (int loop = 1; loop <= 10; loop++) {
			System.out.println(rand.nextInt(maxRange));
		}
	}
}// class
/*
 * Scanner class and its function nextInt() is used to obtain the input, and
 * println() function is used to print on the screen.
 */
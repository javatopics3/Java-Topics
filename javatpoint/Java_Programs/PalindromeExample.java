package Java_Programs;

/**
 * Palindrome Program in Java Palindrome number in java: A palindrome number is
 * a number that is same after reverse. For example 545, 151, 34543, 343, 171,
 * 48984 are the palindrome numbers.
 * 
 * @author Raghunadh
 * 
 */
public class PalindromeExample {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}

/*
 * Write a JAVA program to check weather 
 * the given number is prime or not?
 */
class Prime {
	int n;

	void set(int x) {
		n = x;
	}

	String decide() {
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		if (i == n) {
			return "PRIME";
		} else {
			return "NOT" + "PRIME";
		}
	}

}// class Prime

public class PrimeDemo {
	public static void main(String k[]) {
		int n = Integer.parseInt(k[0]);
		Prime po = new Prime();
		po.set(n);
		String so = po.decide();
		System.out.println(so);
	}

}
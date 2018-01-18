class Mul {
	int n;

	void set(int x) {
		n = x;
	}

	void table() {
		for (int i = 1; i <= 10; i++) {
			int res = n * i;
			System.out.println(n + "*" + i + "=" + res);
		}// for loop
	}// table method
}// class Mul Base class

public class MulDemo {// Execution Logic Class (ELC)
	public static void main(String[] args) {
		Mul mo = new Mul();
		mo.set(4);
		mo.table();
	}// main method
}

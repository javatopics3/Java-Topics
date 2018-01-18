/*
 * Write a JAVA program which illustrates the concept of default constructor, parameterized
   constructor and overloaded constructor
 */
class Test {
	int a, b;

	Test() {
		System.out.println("I AM FROM DEFAULT CONSTRUCTOR...");
		a = 1;
		b = 2;
		System.out.println("VALUE OF a =" + a);
		System.out.println("VALUE OF b =" + b);
	}

	Test(int x, int y) {
		System.out.println("I AM FROM DOUBLE PARAMETERIZED CONSTRUCTOR...");
		a = x;
		b = y;
		System.out.println("VALUE OF a =" + a);
		System.out.println("VALUE OF b =" + b);
	}

	Test(int x) {
		System.out.println("I AM FROM SINGLE PARAMETERIZED CONSTRUCTOR...");
		a = x;
		b = x;
		System.out.println("VALUE OF a =" + a);
		System.out.println("VALUE OF b =" + b);
	}
}// class Test

public class TestDemo2 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test(10, 20);
		Test t3 = new Test(1000);
		// Test t4 = new Test();
	}
}// class Main
/*
 * NOTE: By default the parameter passing mechanism is call by reference.
 * 
 * ‘this ‘: ‘this’ is an internal or implicit object created by JAVA for two
 * purposes. They are i. ‘this’ object is internally pointing to current class
 * object. i. Whenever the formal parameters and data members of the class are
 * similar, to differentiate the data members of the class from formal
 * parameters, the data members of class must be proceeded by ‘this’.
 */

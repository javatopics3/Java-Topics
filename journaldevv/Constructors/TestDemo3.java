package Constructors;

class Test {
	int a, b;

	Test() {
		this(10); // calling current class single parameterized constructor
		System.out.println("I AM FROM DEFAULT CONSTRUCTOR...");
		a = 1;
		b = 2;
		System.out.println("VALUE OF a = " + a);
		System.out.println("VALUE OF b = " + b);
	}// Test() single constructor

	Test(int x) {
		this(100, 200); // calling current class double parameterized
						// constructor
		System.out.println("I AM FROM SINGLE PARAMETERIZED CONSTRUCTOR...");
		a = b = x;
		System.out.println("VALUE OF a = " + a);
		System.out.println("VALUE OF b = " + b);

	}

	Test(int a, int b) {
		System.out.println("I AM FROM DEFAULT CONSTRUCTOR...");
		this.a = a;
		this.b = b;
		System.out.println("VALUE OF a = " + this.a);
		System.out.println("VALUE OF b = " + this.b);
		System.out.println("VALUE OF a = " + a);
		System.out.println("VALUE OF b = " + b);

	}
}// class Test

public class TestDemo3 {
	public static void main(String[] k) {
		Test t1=new Test();
	}// main method
}// main class



/*
 * this (): this () is used for calling current class default constructor from
 * current class parameterized constructors.
 * 
 * this (…): this (…) is used for calling current class parameterized
 * constructor from other category constructors of the same class.
 */

/*
 * Rule for ‘this’: Whenever we use either this () or this (…) in the current
 * class constructors, that statements must be used as first statement only. The
 * order of the output containing this () or this (...) will be in the reverse
 * order of the input which we gave as inputs.
 */
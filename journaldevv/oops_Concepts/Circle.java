package oops_Concepts;

public class Circle implements Shape {
	public void draw() {
		System.out
				.println("Drwaing circle with default color Black and diameter 1 cm.");
	}

	public void draw(int diameter) {
		System.out
				.println("Drwaing circle with default color Black and diameter"
						+ diameter + " cm.");
	}

	public void draw(int diameter, String color) {
		System.out.println("Drwaing circle with color" + color
				+ " and diameter" + diameter + " cm.");
	}

	public static void main(String[] args) {

	}// main method

}// class
/*
 * Here we have multiple draw methods but they have different behavior. This is
 * a case of method overloading because all the methods name is same and
 * arguments are different. Here compiler will be able to identify the method to
 * invoke at compile time, hence it’s called compile time polymorphism.
 */
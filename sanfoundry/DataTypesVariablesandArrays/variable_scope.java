package DataTypesVariablesandArrays;

public class variable_scope {
	public static void main(String args[]) {
		int x;
		x = 5;
		{
			int y = 6;
			System.out.print(x + " " + y);
		}
		System.out.println(x + " " + x);
	}
}
/*
 * o/p:- $ javac variable_scope.java Exception in thread “main” java.lang.Error:
 * Unresolved compilation problem: y cannot be resolved to a variable
 */
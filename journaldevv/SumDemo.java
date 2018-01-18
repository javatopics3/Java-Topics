/*
 * Write a JAVA program which computes sum of two numbers by accepting the data from command
   prompt (DOS)?
 */
class Sum {
	int a, b, c; // a,b,c are data members

	void assign(int x, int y) {// x,y are formal parameters
		a = x;// a,b are are actual parameters
		b = y;
	}// assign method

	void add() // add () is business logic method
	{
		c = a + b;
	}

	void disp() // disp () is business logic method
	{
		System.out.println("SUM OF " + a + " AND " + b + " = " + c);
	}

}// class Sum

public class SumDemo {
	public static void main(String k[]) {
		int x = Integer.parseInt(k[0]);
		int y = Integer.parseInt(k[1]);
		Sum so = new Sum();
		so.assign(x, y);
		so.add();
		so.disp();
	}

}
// NOTE: The data which we pass through command prompt is called command line
// arguments

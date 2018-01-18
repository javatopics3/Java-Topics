package loops;

//The Java break is used to break loop or switch statement. 
//It breaks the current flow of the program at specified condition. 
//In case of inner loop, it breaks only inner loop.
public class BreakExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}

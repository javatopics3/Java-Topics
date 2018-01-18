package loops;

/*
 * The Java continue statement is used to continue loop. 
 * It continues the current flow of the program and skips 
 * the remaining code at specified condition. 
 * In case of inner loop, it continues only inner loop.
 */public class ContinueExample {
	public static void main(String[] args) {  
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	            continue;  
	        }  
	        System.out.println(i);  
	    }  
	}  
}

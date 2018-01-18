package javatpoint;

public class StringClass {
	public static void main(String[] args) {
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)

		System.out.println();

		String s1 = "  Sachin  ";
		System.out.println(s1);// Sachin
		System.out.println(s1.trim());// Sachin

		System.out.println();

		String s3 = "Sachin";
		System.out.println(s3.startsWith("Sa"));// true
		System.out.println(s3.endsWith("n"));// true

		System.out.println();

		String s4 = "Sachin";
		System.out.println(s4.charAt(0));// S
		System.out.println(s4.charAt(3));// h

		System.out.println();

		String s5 = "Sachin";
		System.out.println(s5.length());// 6

		System.out.println();

		String s6 = new String("Sachin");
		String s7 = s.intern();
		System.out.println(s6);// Sachin

		System.out.println();
		
		int a=10;  
		String s8=String.valueOf(a);  
		System.out.println(s8+10);  

		System.out.println();
		
		String s9="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s9.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString); 
	}
}

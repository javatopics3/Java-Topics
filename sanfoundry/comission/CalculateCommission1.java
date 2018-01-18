package comission;

import java.util.Scanner;


class CalculateCommission1
{
	public static void main(String arg[])	
	{
 
	  Scanner sc=new Scanner(System.in);
 
	  System.out.print("Enter amount:");
 
	  double amount=sc.nextDouble();
 
	  System.out.print("Enter commissionPercentage:");
 
          double commissionPercentage=sc.nextDouble();
 
	  double commission=(commissionPercentage/100)*amount;  	   
 
      	  System.out.println("Commission amount="+commission);
 
	}
}

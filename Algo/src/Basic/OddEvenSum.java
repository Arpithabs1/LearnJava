package Basic;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) 
	{
		System.out.println("Enter the integer");
		Scanner scan = new Scanner(System.in);
		int digit = scan.nextInt();
		int natureOfNumber;
		int evenSum =0;
		int oddSum=0;
	    while(digit!=0)
	    {
	    	natureOfNumber = digit%10; 	
	    	if(natureOfNumber%2==0)
	    	{
	    		evenSum+=natureOfNumber;
	    	}
	    	else
	    	{
	    		oddSum+=natureOfNumber;
	    	}
	    	digit=digit/10;
	    }
	    System.out.println("The sum of even numbers is: "+ evenSum);
	    System.out.println("The sum of odd number is: " + oddSum);

	}

}

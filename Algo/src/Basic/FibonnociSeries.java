package Basic;

import java.util.Scanner;

public class FibonnociSeries {

	public static void main(String[] args) 
	{
		System.out.println("Enter the digit");
		Scanner scan = new Scanner(System.in);
		int digit = scan.nextInt();
		int fib1 = 1;
		int sum = 0;
		int fib2 = 0;
		if(digit ==0)
		{
			System.out.println("Fib series for fib is :" + 0);
		}
		else
		{
			for(int i=0;i<digit;i++)
			{		   
				System.out.print(sum + " ");
				fib2 = sum;
			    sum =sum+ fib1;
			    fib1 = fib2 ;
			}
			
		}

	}

}

package Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the digit");
		Scanner scan = new Scanner(System.in);
		int digit = scan.nextInt();
		boolean flag=false;
		for(int i=2;i<digit;i++)
		{
			if(digit%i==0)
			{
				flag = false;
				break;
			}
			else
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("The digit is prime");
		}
		else
		{
			System.out.println("The digit is not prime");
		}
	}

}

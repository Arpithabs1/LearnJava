package Basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int digit = scan.nextInt();
		int result=1;
		for(int i=1;i<=digit;i++)
		{
			result=result*i;
		}
		System.out.println(result);

	}

}

package Basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int digit = scan.nextInt();
		int reverse;
		while(digit!=0)
		{
			reverse = digit%10;
			System.out.print(reverse);
			digit = digit/10;			
		}
	}
}

package Basic;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) 
	{
		System.out.println(" enter the string to check for palindrome");
		Scanner scan = new Scanner(System.in);
		String original = scan.next();
		String reverse = "";
		for(int i = original.length()-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		System.out.println("Printing original : " + original);
		System.out.println("Printing reverse : " + reverse);
		
		if(original.equals(reverse))
		{
			System.out.println("The string is a palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");
		}
	}
	
	

}

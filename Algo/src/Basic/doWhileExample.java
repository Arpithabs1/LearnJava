package Basic;

import java.util.Scanner;

public class doWhileExample {

	public static void main(String[] args) 
	{
		String input ="";
		do
		{
			System.out.println("Enter the first digit");
			System.out.println("Enter the second digit");
			Scanner scan = new Scanner(System.in);
			int digit1 = scan.nextInt();
			int digit2 = scan.nextInt();
			int result = digit1+digit2;
			System.out.println("The sum of two digit is: "+ result);
			System.out.println("Do u want repeat the task? Enter Yes to repeat the task. Enter No to terminate the program");
			input =scan.next();
		}while(input.equals("Yes"));	
	}

}

package Basic;

import java.util.Scanner;

public class multiplicationOfNumber {

	public static void main(String[] args) 
	{
	  System.out.println("Enter the number");
	  Scanner scan = new Scanner(System.in);
	  int digit = scan.nextInt();
	  int result;
	  for(int i=1;i<=10;i++)
	  {
		  result = digit * i;
		  System.out.println(result + " ");
	  }

	}

}

package Basic;

import java.util.Scanner;

public class ArmStrongNumbers {

	public static void main(String[] args) 
	{
	  System.out.println("Enter the number to check if its a ArmStrong");
	  Scanner scan = new Scanner(System.in);
	  int digit = scan.nextInt();
	  int sum=0;
	  int temp=0;
	  int originaldigit = digit;
	  while(digit!=0)
	  {
		  temp = digit%10;
		  sum = sum + (temp*temp*temp);
		  digit =digit/10;
	  }
	  System.out.println("Sum of cube of the digits is: "+ sum);
	  if(sum == originaldigit)
	  {
		  System.out.println("The number is armstrong number");
	  }
	  else
	  {
		  System.out.println("The number is not armstron number");
	  }
      
	}

}

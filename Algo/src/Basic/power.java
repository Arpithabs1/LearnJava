package Basic;

import java.util.Scanner;

public class power {

	public static void main(String[] args) 
	{
       System.out.println("Enter the base number");
       System.out.println("Enter the power number");
       Scanner scan = new Scanner(System.in);
       int base = scan.nextInt();
       int power = scan.nextInt();
       int result=1;
       for(int i=1;i<=power;i++)
       {
    	   result *= base;
       }
       System.out.println(result);
	}

}

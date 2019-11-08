package Basic;

import java.util.Scanner;
import java.util.TreeSet;

public class LargeAndSmall {

	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of digits u wish to enter");
		int count = scan.nextInt();
		System.out.println("Enter the numbers");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<count;i++)
		{
			ts.add(scan.nextInt());
		}
	    System.out.println("The largest number is : "+ ts.last());
	    System.out.println("The smallest number is: "+ ts.first());
	}

}

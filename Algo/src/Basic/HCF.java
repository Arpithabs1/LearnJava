package Basic;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HCF {

	public static void main(String[] args) 
	{
		TreeSet set1 = new  TreeSet();
      System.out.println("Enter the 1st digit");
      System.out.println("Enter the 2nd digit");
      Scanner scan = new Scanner(System.in);
      int digit1= scan.nextInt();
      int digit2=scan.nextInt();
      for(int i=1;i<digit1;i++)
      {
    	  if(digit1%i==0 && digit2%i ==0)
    	  {
    		  set1.add(i);
    	  }
      }
    /*  System.out.println(set1);
      for(int i=1;i<digit2;i++)
      {
    	  if(digit2%i==0)
    	  {
    		  set1.add(i);
    	  }
      } */
      System.out.println(set1);
      System.out.println(set1.last());
	}

}

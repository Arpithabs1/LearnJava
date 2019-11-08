package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) 
	{
	  System.out.println("Enter the number of digits that will be entered");
	  Scanner scan = new Scanner(System.in);
	  int count = scan.nextInt();
      System.out.println("Enter" + count + " digits to count the positive, negative and zero's in the list");     
      int[] digitList;
      int positiveNumber=0;
      int negativeNUmber=0;
      int NumberofZero=0;
      digitList = new int[count];
      for(int i=0;i<count;i++)
      {
    	  digitList[i] = scan.nextInt();
      }
      System.out.println("Printing the list");
      for(int a:digitList)
      {
    	  System.out.print(a + " ");
      }
      System.out.println();
      for(int i=0;i<count;i++)
      {
    	  if(digitList[i]==0)
    	  {
    		  NumberofZero++;
    	  }
    	  else if(digitList[i]<0)
    	  {
    		  negativeNUmber++;
    	  }
    	  else if(digitList[i]>0)
    	  {
    		  positiveNumber++;
    	  }
      }
      System.out.println("The number of postive digits: "+ negativeNUmber );
      System.out.println("The number of negative digits: "+ negativeNUmber );
      System.out.println("The number of Zero's: "+ NumberofZero );
      
	}
}


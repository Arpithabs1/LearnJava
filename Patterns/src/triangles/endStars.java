package triangles;

import java.util.Scanner;

public class endStars {

	public static void main(String[] args) 
	{
      System.out.println("Enter the digit for star triangle");
      Scanner scan = new Scanner(System.in);
      int digit = scan.nextInt();
     // int spaces= digit+2;
      //int inc=1;
      
      for(int i=0;i<digit;i++)
      {
    	  for(int j=2*(digit-i); j>=0; j--)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=0;k<=i;k++)
    	  {
    		  System.out.print("*"+ " ");
    	  }
    	 // inc++;
    	  //spaces=spaces-2;
    	  System.out.println();
      }
	}

}

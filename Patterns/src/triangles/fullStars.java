package triangles;

import java.util.Scanner;

public class fullStars {

	public static void main(String[] args) 
	{
      System.out.println("Enter the number for star triangle");
      Scanner scan = new Scanner(System.in);
      int digit = scan.nextInt();
      int spaces = digit-1;
      int inc = 1;
      
      for(int i=0;i<digit;i++)
      {
    	  for(int j=0;j<spaces;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=0;k<inc;k++)
		  {
			  System.out.print("* ");
		  }
    	  inc++;
    	  spaces--;
    	  System.out.println();
      }
	}

}

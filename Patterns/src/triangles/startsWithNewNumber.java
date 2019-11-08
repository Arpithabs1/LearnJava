package triangles;

import java.util.Scanner;

public class startsWithNewNumber {

	public static void main(String[] args) 
	{
      System.out.println("Enter the numbr to build triangle : ");
      Scanner scan = new Scanner(System.in);
      int triangleDigit = scan.nextInt();
      int numRaise = 1;
      int inc = 1;
      
      for(int i = 0; i<triangleDigit;i++)
      {
        for (int j=0;j<inc;j++)
        {
        	System.out.print(numRaise+ " ");
        	numRaise++;
        }
        inc++;       
        System.out.println();
      }
     
	}

}

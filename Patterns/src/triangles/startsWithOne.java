package triangles;

import java.util.Scanner;

public class startsWithOne {

	public static void main(String[] args)
	{
		System.out.println("Enter the numbr to build the triangle");	
        Scanner scan = new Scanner(System.in);
        int triangleDigit = scan.nextInt();
        
        int myRef = 0;
        
        for(int i = 0; i<=triangleDigit;i++)
        {
        	for (int j= 1 ; j<=myRef ;j++)
        	{
        		System.out.print(j +" ");    		
        	}
        	myRef++;
        	System.out.println();
        }
	}

}

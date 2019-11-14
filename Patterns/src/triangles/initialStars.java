package triangles;

import java.util.Scanner;

public class initialStars {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number to build the star triangle");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int inc = 1;
		for(int i =0;i<num;i++)
		{
			for(int j =0;j<inc;j++)
			{
				System.out.print("*");				
			}
			inc++;
			System.out.println();
		}

	}

}

package Basic;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
      System.out.println("Enter the string");
      Scanner scan = new Scanner(System.in);
      String original = scan.next();
      String reverse="";
      System.out.println("The String original length is " + original.length());
      for(int i = original.length()-1;i>=0;i--)
      {
    	  System.out.println("The String original value is " + original.charAt(i));
    	  reverse = reverse + original.charAt(i);
    	  
      }
      System.out.println("The String reverse is " + reverse);
      if(original.equals(reverse))
      {
    	  System.out.println("The String is palindrome");
      }
      else
      {
    	  System.out.println("The String is not palindrome"); 
      }

	}

}

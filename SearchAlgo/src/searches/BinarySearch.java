package searches;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
	 System.out.println("enter the list of numbers, enter 0 once finished");
	 Scanner scan = new Scanner(System.in);
	 ArrayList<Integer> lst = new ArrayList<Integer>();
	 int value =scan.nextInt();
	 while(value!=0)
	 {
		 lst.add(value);
		 value = scan.nextInt();
	 }
System.out.println(lst);
	/* Iterator itr = lst.iterator();
	 while(itr.hasNext())
	 {
		 System.out.print(itr.next());
	 }*/
	 }

}

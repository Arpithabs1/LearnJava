package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class GroceryList implements Comparator<GroceryList>
{
	private int ItemNumber;
	private String ItemName;
	GroceryList()
	{
		
	}
	GroceryList(int ItemNum, String ItemNam)
	{
		ItemNumber = ItemNum;
		ItemName = ItemNam;
	}
	public String getItemName() 
	{
	  	return ItemName;
	}
	public int getItemNumber() 
	{
	  	return ItemNumber;
	}
	public int compare(GroceryList a,GroceryList b)
	{
		return a.ItemNumber-b.ItemNumber;
	}
	public int compareTo(GroceryList a,GroceryList b)
	{
		return a.ItemName.compareTo(b.ItemName);
	}
}
public class Comparator2 {

	public static void main(String[] args) 
	{
		ArrayList<GroceryList> glist = new ArrayList<GroceryList>();
		glist.add(new GroceryList(7,"Rice"));
		glist.add(new GroceryList(1, "Sugar"));
		glist.add(new GroceryList(4,"Rava"));
        
		for(GroceryList b : glist)
		{
			System.out.println(b.getItemNumber());
		}
		Collections.sort(glist, new GroceryList());
		for(GroceryList b : glist)
		{
			System.out.println(b.getItemNumber());
		}
	}

}

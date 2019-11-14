package ThreadConcepts;

class Tables extends Thread
{
	public void printTables(int a)
	{
		for(int i=1;1<=5;i++)
		{
			System.out.print(" Tables values are : "+ a*i);
		}
	}
}

class Thread1 
{
	Tables t1 = new Tables();
}

public class WithOutSync {

	public static void main(String[] args) 
	{
		

	}

}

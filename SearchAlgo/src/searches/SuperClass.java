package searches;

public class SuperClass 
{
	SuperClass()
	{
		System.out.println(" Running Super Class contructor");
	}
	
	SuperClass(int a)
	{		
		System.out.println(" Running Super Class contructor param");
	}
	SuperClass(int a, int v)
	{
		System.out.println(" Running Super Class contructor param");
	}
	public void aab()
	{
		
	}
}

 class SubClass extends SuperClass
{
	
	SubClass(int v)
	{
		super(8);
		System.out.println(" Running Sub Class contructor param");
		
	}
	public void gh()
	{
		
	}
	SubClass o = new SubClass(2);
    public void v()
    {
    	gh();
    	aab();
    	o.aab();
    }
	 
}

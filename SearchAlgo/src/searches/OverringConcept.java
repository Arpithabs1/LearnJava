package searches;

class A
{
	 void aa()
	{
		System.out.println("super classs");
	}
}

class B extends A
{
	void aa()
	{
		System.out.println("sub classs");
	}
}

public class OverringConcept {

	public static void main(String[] args) 
	{
		A a1 = new B();
		a1.aa();
	}

}

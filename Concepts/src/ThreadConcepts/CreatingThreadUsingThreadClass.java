package ThreadConcepts;

class TestThread extends Thread
{
	public void run()
	{
		System.out.println("Thread has been created");
		System.out.println(Thread.currentThread().getId());
	}
}

public class CreatingThreadUsingThreadClass {

	public static void main(String[] args) 
	{
		TestThread threadObj = new TestThread();
		threadObj.start();
	}

}

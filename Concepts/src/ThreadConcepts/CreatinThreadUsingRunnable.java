package ThreadConcepts;

class ThreadCreation implements Runnable
{
	public void run()
	{
		System.out.println("Thread creation");
		System.out.println(Thread.currentThread().getId());
	}
}

public class CreatinThreadUsingRunnable {

	public static void main(String[] args) 
	{
		Thread obj = new Thread(new ThreadCreation());
		obj.start();

	}

}

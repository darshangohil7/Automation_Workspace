package Programs;
class K1 implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread K1: "+i);
		}
	}
}
class K2 implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Thread K2: "+i);
		}
	}
}
public class Program_21_Thread_implements_runnable 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new K1());
		Thread t2=new Thread(new K2());
		
		t1.start();
		t2.start();
	}
}
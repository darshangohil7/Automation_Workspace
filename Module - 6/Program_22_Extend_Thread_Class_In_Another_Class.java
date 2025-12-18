package Programs;
class S1 extends Thread
{
	public void run () 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Thread A: "+i);
		}
	}
}
class S2 extends Thread
{
	public void run () 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Thread B: "+i);
		}
	} 
}
public class Program_22_Extend_Thread_Class_In_Another_Class 
{

	public static void main(String[] args) 
	{
		S1 H1=new S1();
		S2 H2=new S2();
		
		H1.start();
		H2.start();
	}
}

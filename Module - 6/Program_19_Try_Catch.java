package Programs;

public class Program_19_Try_Catch 
{
	public static void main(String[] args) 
	{
		try 
		{
			int num = 10/0;
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Success");
		}
	}
}

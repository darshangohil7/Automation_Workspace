package Tops_Programs;

abstract class Parent 
{
	abstract void message();
}
class FirstSubclass extends Parent 
{
	@Override
	void message() 
	{
		System.out.println("This is first subclass");
	}
}

// Second subclass
class SecondSubclass extends Parent 
{
	@Override
	void message() 
	{
		System.out.println("This is second subclass");
	}
}

public class Program_28_Abstract_Class 
{
	public static void main(String[] args) 
	{
		Parent p1 = new FirstSubclass();
		p1.message();

		Parent p2 = new SecondSubclass();
		p2.message();
	}
}
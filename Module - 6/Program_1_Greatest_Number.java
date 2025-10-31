package Programs;

import java.util.Scanner;

public class Program_1_Greatest_Number 
{
	//....Print the Greatest Number By Using User Input....//

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Your Second Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Your Third Number: ");
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("The Greatest Number is: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The Greatest Number is: "+b);
		}
		else
		{
			System.out.println("The Greatest Number is: "+c);
		}
	}

}

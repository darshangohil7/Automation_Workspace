package Programs;

import java.util.Scanner;

public class Program_3_Factorial_Number {

	public static void main(String[] args) 
	{
		
		//....Factorial Number By User Input....//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Numer To Get It's Factorial: ");
		int a = sc.nextInt();
		int b = 1;
		for(int i=1;i<=a;i++)
		{
			b*=i;
		}
		System.out.println("Factorial of "+ a +" is:" +b);
	}

}

package Programs;

import java.util.Scanner;

public class Program_4_Number_is_Prime_or_Not {

	public static void main(String[] args) 
	{
		//....User Input Number is Prime Number or Not....//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Positive Number To Check It's a Prime Number or Not: ");
		int a = sc.nextInt();
		int count = 0;
		for(int i=1;i<=a;i++) 
		{
			if(a%i==0) 
			{
				count++;
			}
		}
		if(count==2) 
		{
			System.out.println("The Given Number is Prime Number.");
		}
		else
		{
			System.out.println("The Given Number Isn't A Prime Number.");
		}
		
	}

}

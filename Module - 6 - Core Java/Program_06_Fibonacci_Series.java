package Tops_Programs;

import java.util.Scanner;

public class Program_06_Fibonacci_Series {

	public static void main(String[] args) 
	{
		
		//....Fibonacci Series....//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any number to Get Fibonacci Series:");
		int a = sc.nextInt();
		int f=0, s=1, n;
		for(int i=1;i<=a;i++) 
		{
			System.out.print(f+"  ");
			n=f+s;
			f=s;
			s=n;
		}

	}

}
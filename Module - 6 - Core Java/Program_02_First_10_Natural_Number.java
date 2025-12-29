package Tops_Programs;

import java.util.Scanner;

public class Program_02_First_10_Natural_Number 
{
	public static void main(String[] args) 
	{
		//....Print First Natural 10 Numbers Using While Loop.....//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Know Natural Number: ");
		int a = sc.nextInt();
		int i=1;
		while(i<=a)
		{
			System.out.println(i);
			i++;
		}
	}
}
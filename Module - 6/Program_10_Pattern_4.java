package Programs;

import java.util.Scanner;

public class Program_10_Pattern_4 {

	public static void main(String[] args) 
	{
		//    *
		//   * *
		//  * * *
		// * * * *
		//* * * * *
		// * * * *
		//  * * *
		//   * *
		//    *
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int a = sc.nextInt();
		for (int i=0;i<a;i++) 
		{
			for (int s=0;s<a-i-1;s++) 
			{
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=0;i<a-1;i++) 
		{
			for (int s=0;s<=i;s++) 
			{
				System.out.print(" ");
			}
			for (int j=0;j<a-i-1;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

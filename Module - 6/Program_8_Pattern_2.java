package Programs;

import java.util.Scanner;

public class Program_8_Pattern_2 {

	public static void main(String[] args) 
	{
		// 1
		// 01
		// 101
		// 0101
		// 10101
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print(((i+j)%2));
			} 
			System.out.println();
		}
	}
}

package Programs;

import java.util.Scanner;

public class Program_7_Pattern {

	public static void main(String[] args) 
	{
		//....Pattern....//
		//1
		//12
		//123
		//1234
		//12345
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}

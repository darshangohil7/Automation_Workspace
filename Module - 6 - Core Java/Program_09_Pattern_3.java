package Tops_Programs;

import java.util.Scanner;

public class Program_09_Pattern_3 
{

	public static void main(String[] args) 
	{
		//    1
		//   222
		//  33333
		// 4444444
		//555555555
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Number of Rows: ");
		 int a = sc.nextInt();
		 for(int i=1;i<=a;i++) 
		 {
			 for(int s=0;s<(a-i);s++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0;j<(i*2-1);j++) 
			 {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
	}
}
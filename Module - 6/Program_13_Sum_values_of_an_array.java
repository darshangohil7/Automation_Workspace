package Programs;

import java.util.Scanner;

public class Program_13_Sum_values_of_an_array {

	public static void main(String[] args) 
	{
		int add=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How Many Numnbers You Want To Get Addition: ");
		int num = sc.nextInt();
		
		int a[] = new int[num];
		for(int i=0;i<num;i++) 
		{
			System.out.print("Enter "+ (i+1) +" Number: ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) 
		{
			add+=a[i];
		}
		System.out.println("Addition of Given Numbers: "+add);

	}

}

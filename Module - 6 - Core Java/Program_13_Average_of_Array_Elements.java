package Tops_Programs;

import java.util.Scanner;

public class Program_13_Average_of_Array_Elements 
{
	public static void main(String[] args) 
	{
		int add=0, avg, total = 0, in = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How Many Numnbers You Want To Get Addition & Average: ");
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
			total=add;
		}
		avg = (add/num);
		System.out.println("Addition of Given Numbers: "+total);
		System.out.println("Average of Given Numbers: "+avg);
		System.out.print("Enter The Number of Which You Want Index: ");
		int index = sc.nextInt();
		
		if(index<=num)
		{
			int ind;
			ind=index-1;
			System.out.println("Entered Value Index: "+ind);
		}
		else 
		{
			System.out.println("Wrong Entry, Run Whole Program Again.");
		}
	}
}


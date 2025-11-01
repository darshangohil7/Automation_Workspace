package Programs;

import java.util.Scanner;

public class Program_5_Armstrong_Number 
{
	//.... Check The Number is Armstrong or Not....//
	
	public static boolean checknum (int num) 
	{
		int originalnum = num;
		int sumofpowers = 0;
		int numberofdigits = String.valueOf(num).length();
		while(num>0) 
		{
			int digit=num%10;
			sumofpowers+=Math.pow(digit, numberofdigits);
			num/=10;
		}
		return originalnum==sumofpowers;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Positive Number: ");
		int num = sc.nextInt();
		System.out.println(checknum(num));

	}

}

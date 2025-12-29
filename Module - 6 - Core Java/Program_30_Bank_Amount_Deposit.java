package Tops_Programs;

import java.util.Scanner;

public class Program_30_Bank_Amount_Deposit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount To Deposit: ");
		double amount=sc.nextDouble();
		System.out.println("===============================================================");
		System.out.println("Your Account Has Been Credited With "+ amount + " Successfully.");
		System.out.println("===============================================================");
		System.out.print("Enter Withdrawal Amount: ");
		double withdrawal=sc.nextDouble();
		System.out.println("===============================================================");
		if(withdrawal<=amount) 
		{
			double a = amount - withdrawal;
			double b = a;
			System.out.println("Your Account Has Been Debited With " + withdrawal);
			System.out.println("===============================================================");
			System.out.println("Your Account Has Amount Left " + b +"Rs.");
		}
		else 
		{
			double c = withdrawal - amount;
			double d = c;
			System.out.println("Your Withdrawal Amount is Greater Than You Have In Your Account.");
			System.out.println("You Need To Deposit " + d + " Rs. More To Make This Transaction.");
		}
	}

}

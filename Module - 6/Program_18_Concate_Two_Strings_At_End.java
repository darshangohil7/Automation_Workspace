package Programs;

import java.util.Scanner;

public class Program_18_Concate_Two_Strings_At_End 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1=sc.nextLine();
		System.out.print("Enter Second String: ");
		String s2=sc.nextLine();
		String result = s1.concat(" ").concat(s2);
		System.out.println("Concate String: "+result);
	}
}

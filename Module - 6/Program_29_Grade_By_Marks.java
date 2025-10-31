package Programs;

import java.util.Scanner;

public class Program_29_Grade_By_Marks 
{

	public static void main(String[] args) 
	{
		
		//....Entering Marks By User Input & Print Grade According to That....//

		Scanner sc = new Scanner(System.in);
		while(true) 
		{
		System.out.print("Enter Your Marks To Know Your Grade: ");
		int a = sc.nextInt();
		 
		{
			if(a>=91 && a<=100) 
			{
				System.out.println("Your Grade is AA");
				break;
			}
			else if(a>=81 && a<90) 
			{
				System.out.println("Your Grade is AB");
				break;
			}
			else if(a>=71 && a<=80) 
			{
				System.out.println("Your Grade is BB");
				break;
			}
			else if(a>=61 && a<=70) 
			{
				System.out.println("Your Grade is BC");
				break;
			}
			else if(a>=51 && a<=60) 
			{
				System.out.println("Your Grade is CD");
				break;
			}
			else if(a>=41 && a<=50) 
			{
				System.out.println("Your Grade is DD");
				break;
			}
			else if(a<=40) 
			{
				System.out.println("Your Are Fail.");
				break;
			}
		}
		System.out.println("====================================");
		System.out.println("Please Enter Marks between 0 to 100.");
		System.out.println("====================================");
		continue;
		}
	}
}	


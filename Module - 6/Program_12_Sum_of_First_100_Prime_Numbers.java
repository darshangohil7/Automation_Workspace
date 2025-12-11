package Programs;

import java.util.Scanner;
public class Program_12_Sum_of_First_100_Prime_Numbers 
{

	  public static void main(String[] args) 
	  {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter how many prime numbers you want: ");
	        int n = sc.nextInt();

	        int count = 0;    
	        int number = 2;   
	        int sum = 0;      

	        while (count < n) 
	        {
	        	int i;
	            for (i=2; i<=number/2;i++) 
	            {
	                if(number%i==0) 
	                {
	                    break;  
	                }
	            }   
	            if (i>number/2) 
	            {
	                System.out.print(number+" ");
	                sum += number;
	                count++;
	            }
	            number++;
	        }	        
	        System.out.println("\n\nSum of first " + n + " prime numbers: " + sum);
	    }
	} 
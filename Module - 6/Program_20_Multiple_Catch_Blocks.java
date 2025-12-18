package Programs;

import java.util.Scanner;

public class Program_20_Multiple_Catch_Blocks 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        try
	        {
	            System.out.print("Enter first number: ");
	            int a = sc.nextInt();

	            System.out.print("Enter second number: ");
	            int b = sc.nextInt();

	            int arr[] = {10, 20, 30};

	            System.out.print("Enter array index (0 to 2): ");
	            int index = sc.nextInt();

	            System.out.println("Division result: " + (a / b));
	            System.out.println("Array value: " + arr[index]);
	        }
	        catch (ArithmeticException e)
	        {
	            System.out.println("Arithmetic Exception: Division by zero is not allowed");
	        }
	        catch (ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("Array Exception: Invalid array index");
	        }
	        catch (Exception e)
	        {
	            System.out.println("General Exception: Invalid input");
	        }
	        finally
	        {
	            System.out.println("Program execution completed");
	            sc.close();
	        }
	    }
	}


package Programs;

import java.util.Scanner;

public class Program_11_Sum_of_First_100_Prime_Numbers {

	public static void main(String[] args) 
	{
		//First 100 Prime Numbers = 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43
		// 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
		// 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257,
		// 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367,
		// 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467
		// 479, 487, 491, 499, 503, 509, 521, 523, 541.  
		// Total Sum = 24,133.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to Get Sume of Prime Number: ");
		int a = sc.nextInt();
		int pn = 0;
		int n = 2;
		int sum = 0;
		
		while(pn<a) 
		{
			int b=0;
			for (int i=1;i<=n;i++) 
			{
				if(n%i==0) 
				{
					b++;
				}
			}
			if(b==2)
			{
				sum+=n;
				pn++;
			}
			n++;
		}
			
		System.out.println("Sum of First " + a + "Prime Numbers = " + sum);
	}

}

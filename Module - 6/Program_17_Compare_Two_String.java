package Programs;

public class Program_17_Compare_Two_String {

	public static void main(String[] args) 
	{
		String s1 = "Darshan Gohil was a Billing Engineer But Now He is a Jr. QA Analyst.";
		String s2 = "Manthan Patel Was Interested To Do QA in Automation But Now He Wants To Open A Business For Himself.";
		
		System.out.println("First String Length is: " +s1.length());
		System.out.println("Second String Length is: " +s2.length());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s2.trim());
	}
}

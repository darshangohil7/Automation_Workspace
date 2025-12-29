package Tops_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_25_Copy_One_Array_To_Another 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Goku Went");
		list1.add("Super Saiyan &");
		list1.add("Fired Kamehameha");
		list1.add("Towards Vegeta.");

		ArrayList<String> list2 = new ArrayList<>();

		Iterator<String> i = list1.iterator();
		while (i.hasNext()) 
		{
			list2.add(i.next());
		}

		System.out.println("Copied ArrayList:");
		System.out.println(list2);
	}
}
package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_23_Iterate_Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		list.add("Goku Went");
		list.add("Super Saiyan &");
		list.add("Fired Kamehameha");
		list.add("Towards Vegeta.");
		//System.out.println(list);
		
		Iterator i = list.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}

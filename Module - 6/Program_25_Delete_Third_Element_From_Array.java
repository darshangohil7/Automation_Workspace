package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_25_Delete_Third_Element_From_Array 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		list.add("Goku Went");
		list.add("Super Saiyan &");       //changed array
		list.add("Fired Kamehameha");
		list.add("Towards Vegeta.");
		//System.out.println(list);
		ArrayList list2 = new ArrayList<>();
		list.add("Vegeta Went");
		list.add("Super Saiyan &");
		list.add("Fired Galikgun");
		list.add("Towards Goku.");
		
		ArrayList list3 = new ArrayList<>();
		list.add("They Hit");
		list.add("Each-other &");
		list.add("Explosion Was");
		list.add("Like Earthshaking.");
		list.set(1, "Ultra Instinct &");   // Update Specific Array
		list.remove(7);       			   // Delete Third Element
		
		list.addAll(list2);
		list.addAll(list3);
		Iterator i = list.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}

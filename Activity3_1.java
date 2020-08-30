package Activity3_1;

import java.util.ArrayList;

public class Activity3_1 {
	
	public static void main(String[] args) 
	
	{
	
	ArrayList<String> myList = new ArrayList<String>();
	myList.add("Happy");
	myList.add("Vinny");
	myList.add("Lucky");
	myList.add(3,"Bunty");
	myList.add(1,"Sunny");
	
	System.out.println("Printing Objects:\n");
	
	for(String s:myList)
	{
		System.out.println(s);
	}
	
	System.out.println("\n Retrieving using Index:"+ myList.get(2)); 
	System.out.println("\nUsing Contains method:"+ myList.contains("Lucky"));
	System.out.println("\n Size: " + myList.size());
	System.out.println("\nRemoving a value:"+myList.remove("Sunny"));
	System.out.println("\n Size after removal: " + myList.size());
	
		}

}

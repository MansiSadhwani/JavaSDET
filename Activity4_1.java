package Activity4_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen=new Random();
		
		System.out.println("Enter the Array values: ");
		System.out.println("\n Enter non integer to terminate: ");
		
		while(scan.hasNextInt())
		{
			list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index generated: "+ index);
		System.out.println("Value generated at Index: "+ index + "is: "+nums[index]);
		scan.close();
		
		

	}

}

package JavaActivity3;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) 
	{

			int[] numbers = {22,56,43,89,32,67};
			System.out.println("Unsorted Array: "+Arrays.toString(numbers));
			sort(numbers);
			
	}
	
	public static void sort(int nums[])
	{
		
		int count = nums.length;
		int i,j,temp = 0;
		
		int[] sortresult = new int[count];
		for(i=0; i<count;i++)
		{	
			int min = Integer.MAX_VALUE;
		
			j=0;
			while(j<count)
			{
				if(nums[j]>temp)
			if(min>nums[j])
			{
				min = nums[j];
				
			}
				j++;				
			}	
			temp = min;
			sortresult[i] = min;
			
			
		}	
		System.out.println("Sorted Array: "+Arrays.toString(sortresult));
	}

}

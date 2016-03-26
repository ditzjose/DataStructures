package com.dynamic;
import static java.lang.System.*;

public class MaxSumSubArray {
	static Integer kadane(Integer[] arr)
	{
		
		// Brute force technique O(n)
		/*Integer sum = -999999;
		Integer tempVal = 0;
		for(int i = 0  ; i < arr.length ; i++)
		{
			for(int j = i ; j < arr.length ; j++)
			{
				tempVal = tempVal + arr[j];
				if(tempVal > sum)
				{
					sum = tempVal;
				}
			}
			tempVal = 0;
			
		}
		return sum;*/
		Integer totalsum = arr[0];
		Integer currentsum = arr[0];
		Integer i = 1;
		
		while(i < arr.length)
		{
			currentsum = Math.max(arr[i], currentsum + arr[i]);
			if(totalsum < currentsum)
			{
				totalsum = currentsum;
			}
		
			i++;
		}
		
		
		return (totalsum);
	}
	public static void main(String... command)
	{
		Integer[] arr = {1,-3,2,-5,7,6,-1,-4,11,-23}; //-4,15,-6,18,2,20
		out.println(kadane(arr));
	}
}

package com.dynamic;

import java.util.Arrays;

public class SubSetSumProblem {
	
	static void findSubSet(Integer[] arr, int sum)
	{
		Arrays.sort(arr);
		Integer j = arr.length -1;
		Integer k = 0;
		Integer temp = sum;
		// do deep copy
		Integer[] tempArr =  new Integer[arr.length]; //Arrays.copyOf(arr, arr.length);
		Integer[] tempArr2 =  new Integer[arr.length]; 
		for(Integer i =0 ; i < arr.length ; i++ )
		{
			tempArr[i] = arr[i];
			tempArr2[i] = arr[i];
		}
		// Best case its o(n)
		// Worst case its o(n*n)
		while(j >= 0)
		{
			if(arr[j] <= sum)
			{
				sum = sum - arr[j];
				arr[j] = -999;
				
			}
			if(j == 0 && sum != 0)
			{
				k++;
				sum = temp;
				arr = tempArr;
				j = arr.length - k ;
			}
			
			j--;
		}
		if(sum != 0 )
		{
			System.out.println("No sum found");
		}
		else
		{
			for(Integer i = 0 ; i < arr.length ; i++)
			{
				if(arr[i] == -999)
				{
					System.out.print(tempArr2[i]+" ");
				}
				
			}
			System.out.println(" ");
		}
	}
	public static void main(String... command)
	{
		findSubSet(new Integer[] {2,3,7,8,10},11);
	}
}

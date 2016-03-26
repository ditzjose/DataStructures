package com.dynamic;
import static java.lang.System.*;

import java.util.Arrays;
public class LongestIncreasingSubSeuence {
	static Integer longestIncSS(Integer[] arr)
	{
		Integer[] arr1 = new Integer[arr.length]; 
		Arrays.fill(arr1, 1);
		int i = 1;
		int j = 0;
		// O(N*logN) is the time complexity
		// O(N*N) is the space complexity
		while(i < arr.length)
		{
			while(j < i)
			{
				if(arr[j] < arr[i])
				{
					arr1[i] = Math.max(arr1[i], arr1[j]+1);
				}
				j++;
			}
			j = 0;
			i++;
		}
		
		
		return arr1[arr.length-1];
	}
	static Integer[] bitonicSe(Integer[] arr)
	{
		Integer[] arr1 = new Integer[arr.length]; 
		Arrays.fill(arr1, 1);
		int i = 1;
		int j = 0;
		// O(N*logN) is the time complexity
		// O(N*N) is the space complexity
		while(i < arr.length)
		{
			while(j < i)
			{
				if(arr[j] < arr[i])
				{
					arr1[i] = Math.max(arr1[i], arr1[j]+1);
				}
				j++;
			}
			j = 0;
			i++;
		}
		for(Integer val : arr1)
		{
			out.print(val+"  ");
		}
		out.println("");
		return arr1;
	}
	
	static Integer[] bitonicSeReverse(Integer[] arr)
	{
		Integer[] arr1 = new Integer[arr.length]; 
		Arrays.fill(arr1, 1);
		int i = arr.length -2; //1;
		int j = arr.length-1;
		while(i >= 0)
		{
			while(j > i)
			{
				if(arr[j] < arr[i])
				{
					arr1[i] = Math.max(arr1[i], arr1[j]+1);
				}
				j--;
			}
			j = arr.length-1;
			i--;
		}
		for(Integer val : arr1)
		{
			out.print(val+"  ");
		}
		out.println("");
		return arr1;
	}
	public static void main(String... cla)
	{
		Integer[] arr = {2,-1,4,3,5,-1,3,2};//{3,4,-1,0,6,2,3};//{2,-1,4,3,5,-1,3,2};
		Integer[] arr2 ={2,-1,4,3,5,-1,3,2};
		Integer[] bitonicresult = new Integer[arr.length];
	/*	int i = 0 ;
		int j = arr.length -1;
		while( i < arr.length && j >= 0 )
		{
			arr2[i] = arr[j];
			i++;
			j--;
		}*/
		out.println("Longest sequesnce is :  "+longestIncSS(arr));
		arr = bitonicSe(arr);
		arr2 = bitonicSeReverse(arr2);
		//arr2 = bitonicSe(arr2);
		Integer iii = 0;
		while(iii < bitonicresult.length)
		{
			bitonicresult[iii] = arr[iii] + arr2[iii] - 1 ;
		iii++;
		}
		
		out.println(" Bitonic seuence is : ");
		for(int val : bitonicresult)
		{
			out.print(val+" ");
		}
	
	}
}

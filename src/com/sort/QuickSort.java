package com.sort;
import static java.lang.System.*;
// Quick sort Best case is O(n)
// and the worst case is o(n*n)
public class QuickSort {
	public static void  swap(Integer[] arr,Integer i , Integer wall)
	{
		Integer temp = arr[i];
		arr[i] 	  = arr[wall];
		arr[wall] = temp;
	}
	public static Integer[] sort(Integer[] arr, Integer wall)
	{
		Integer i = wall;
		Integer pivot = arr[arr.length-1];
		while(i < arr.length)
		{
			if(arr[i] < pivot)
			{
				swap(arr,i,wall);
				wall++;
			}
			i++;
		}
		swap(arr,arr.length-1,wall);
		wall++;
		if(wall == arr.length -1)
		{
			return arr;
		}
		else
		{
			return sort(arr,wall);
		}
	
	}
	public static void main(String... commandLineArgument)
	{
		Integer[] arr = {6,5,1,3,8,4,7,9,2};
		Integer[] sortedArray = sort(arr,0);
		
		for(Integer val : sortedArray)
		{
			out.print(val+"  ");
		}
		out.println("  ");
	}

}

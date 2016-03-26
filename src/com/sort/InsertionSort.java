package com.sort;
import static com.sort.QuickSort.*;
import static java.lang.System.*;
public class InsertionSort {
	// Insertion sort Best case O(N) worst O(N*N)
	public static Integer[] sort(Integer[] arr)
	{
		for(int i = 0 ; i < arr.length -1 ; i++)
		{
			Integer sort = i+1;
			Integer j = sort;
			while(j > 0 && arr[j] < arr[j-1])
			{
				swap(arr,j,j-1);
				j--;
			}
		}
		return arr;
	}
	public static void main(String... arr)
	{
		Integer[] result = sort(new Integer[] {23,42,4,16,8,15});
		for(Integer val : result)
		{
			out.print(val+" ");
		}
		out.println("");
	}
}

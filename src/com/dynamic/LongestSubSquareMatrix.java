package com.dynamic;
import static java.lang.Math.*;
import static java.lang.System.*;

public class LongestSubSquareMatrix {
	public static Integer[][] longestSquare(Integer[][] arr)
	{
		Integer[][] arr2 = new Integer[arr.length+1][arr.length+1];
		for(Integer i = 0; i < arr.length+1 ; i++)
		{
			arr2[0][i] = 0;
			arr2[i][0] = 0;
		}
		
		for(Integer i = 1 ; i < arr2[0].length ; i++)
		{
			for(Integer j = 1 ; j < arr2[0].length ; j++)
			{
				if(arr[i-1][j-1] == 1) {	
					arr2[i][j] = min(min(arr2[i-1][j-1], arr2[i-1][j+0]),arr2[i+0][j-1])+1;
				}
				else
				{
					arr2[i][j] = 0;
				}
			}
		}
		
		return arr2;
	}
	public static void main(String... command)
	{
		Integer[][] arr = {
							{0,0,1,1,1},
							{1,0,1,1,1},
							{0,1,1,1,1},
							{1,0,0,0,0},
							{1,0,0,0,0}
							};
		Integer[][] resultArr = longestSquare(arr);
		for(Integer[] val : resultArr)
		{
			for(Integer val1 : val)
			{
				out.print(val1);
			}
			out.println("");
		}
		
	}
}

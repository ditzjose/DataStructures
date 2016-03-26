package com.ds;
import static java.lang.System.*;
public class MultiArrays {
	public static void main(String... cmd)
	{
		Integer[][][] arr = new Integer[3][3][];
		arr[0][0] = new Integer[]{0,0,0};
		arr[0][1] = new Integer[]{1,1,1};
		arr[0][2] = new Integer[]{2,2,2};
		arr[1][0] = new Integer[]{3,3,3};
		arr[1][1] = new Integer[]{4,4,4};
		arr[1][2] = new Integer[]{5,5,5};
		arr[2][0] = new Integer[]{6,6,6};
		arr[2][1] = new Integer[]{7,7,7};
		arr[2][2] = new Integer[]{8,8,8};
		
		
		for(Integer[][] val1 : arr)
		{
			for(Integer[] val2 : val1)
			{
				for(Integer val3 : val2)
				{
					out.print(val3+"  ");
				}
				out.print("     :     ");
			}
			out.println("");
		}
		
	}
}

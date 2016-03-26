package com.dynamic;

import java.util.Scanner;
import static java.lang.System.*;

public class ReadMultiDimensionalArray {
	public static Integer[][] readArrayInt()
	{
		Scanner sc = new Scanner(in);
		String line1 = sc.nextLine();
		Integer row = Integer.parseInt(line1);
		String line2 = sc.nextLine();
		Integer col = Integer.parseInt(line2);
		Integer[][] arr = new Integer[row][col];
		String line = sc.nextLine();
		int i = 0;
		while(line != null && i < row)
		{
			String[] arr1 = line.split("[ ]");
			for(int ii= 0 ; ii < col ; ii++)
			{
				arr[i][ii] = Integer.parseInt(arr1[ii]);
			}
			i++;
			line = sc.nextLine();
		}
		sc.close();
		return arr;
	}

}

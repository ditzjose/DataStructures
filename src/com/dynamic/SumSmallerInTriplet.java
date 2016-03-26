package com.dynamic;

import static java.lang.System.*;

import java.util.Arrays;

public class SumSmallerInTriplet {
	static Integer smallTriplet(Integer[] arr, int sum) {
		Integer count = 0;
		for (Integer i = 0; i < arr.length; i++) {
			Integer j = i + 1;
			Integer k = arr.length - 1;

			while (j < k) {
				if (sum < (arr[i] + arr[k] + arr[j])) {
					count++;
					k--;
				} else {
					j++;
				}
			}

		}
		return count;
	}

	public static void main(String... command) {
		Integer[] arr = { -2, 0, 1, 3, -1 };
		Arrays.sort(arr);
		out.println("The number of triplets are:   " + smallTriplet(arr, 2));
	}
}

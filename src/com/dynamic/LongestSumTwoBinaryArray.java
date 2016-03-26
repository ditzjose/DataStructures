package com.dynamic;

import static java.lang.System.*;

public class LongestSumTwoBinaryArray {
	static Integer longestSum(Integer[] arr1, Integer[] arr2, Integer n,
			Integer m) {
		Integer sum1 = 0;
		Integer sum2 = 0;
		Integer curlength = 0;
		Integer maxLen = 0;
		for (Integer i = 0; i < n; i++) {
			for (Integer j = i; j < m; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];

				if (sum1 == sum2) {
					curlength = j - i + 1;
					if (maxLen < curlength) {
						maxLen = curlength;
					}
				}

			}
			sum1 = 0;
			sum2 = 0;
		}
		return maxLen;
	}

	public static void main(String... command) {
		Integer[] arr1 = { 0, 1, 0, 0, 0, 0 };
		Integer[] arr2 = { 1, 0, 1, 0, 0 };
		out.println("Max sum is :  "
				+ longestSum(arr1, arr2, arr1.length, arr2.length));
	}
}

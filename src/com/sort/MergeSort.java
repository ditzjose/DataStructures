package com.sort;

import static java.lang.System.*;

// Merge sort best and worst case is O(nLogn)
public class MergeSort {
	public static Integer[] mergeSort(Integer[] arr) {
		if (arr.length <= 1) {
			return arr;
		}

		Integer[] first = new Integer[arr.length / 2];
		Integer[] second = new Integer[arr.length - first.length];

		arraycopy(arr, 0, first, 0, first.length);
		arraycopy(arr, first.length, second, 0, second.length);

		mergeSort(first);
		mergeSort(second);

		merge(first, second, arr);
		return arr;
	}

	private static void merge(Integer[] first, Integer[] second, Integer[] arr) {
		Integer i = 0;
		Integer j = 0;
		Integer mergIndex = 0;
		while (i < first.length && j < second.length) {
			if ((first[i].compareTo(second[j])) < 0) {
				arr[mergIndex] = first[i];
				i++;
				mergIndex++;
			} else {
				arr[mergIndex] = second[j];
				j++;
				mergIndex++;
			}
		}
		// Copy the remain elements
		arraycopy(first, i, arr, mergIndex, first.length - i);
		arraycopy(second, j, arr, mergIndex, first.length - j);
		// arraycopy(arr, 0, first, 0, first.length);
	}

	public static void main(String... commandLineArg) {
		Integer[] arr = { 4, 2, 3, 5 };
		Integer[] res = mergeSort(arr);
		for (Integer val : res) {
			out.print(val + "  ");
		}
		out.println("  ");
	}
}

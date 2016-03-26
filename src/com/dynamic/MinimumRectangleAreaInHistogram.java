package com.dynamic;

import java.util.Stack;

public class MinimumRectangleAreaInHistogram {
	static Integer MaxAreaHisto(Integer[] arr) {
		Stack<Integer> stack = new Stack<>();
		Integer area = 0;
		Integer maxArea = -1;
		Integer top = 0;
		for (Integer i = 0; i < arr.length; i++) {
			if (stack.isEmpty()) {
				stack.push(i);
			} else {
				if (arr[i] > arr[i - 1]) {
					stack.push(i);
				} else {
					top = stack.pop();
					if (stack.isEmpty()) {
						area = arr[top] * i;
						maxArea = Math.max(maxArea, area);
					} else {
						area = arr[top] * (i - stack.peek() - 1);
						Math.max(area, maxArea);
					}
					i--;
				}
			}
		}
		return maxArea;
	}

	public static void main(String... commandLine) {
		Integer[] arr = { 2, 1, 2, 3, 1 };
		Integer max = MaxAreaHisto(arr);
		System.out.println("The max value is :   "+max);
	}
}

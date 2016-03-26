package com.dynamic;

import static java.lang.System.*;

public class MinimumNumberOfCoins {
	static Integer[][] coinChange(Integer[] coins, Integer sum) {
		Integer row = coins.length;
		Integer col = sum + 1;
		Integer[][] arr = new Integer[row][col];
		for (Integer i = 0; i < row; i++) {
			for (Integer j = 0; j < col; j++) {
				if (coins[i] == 1) {
					arr[i][j] = j;
				} else {
					if (j < coins[i]) {
						arr[i][j] = arr[i - 1][j];
					} else {
						arr[i][j] = Math.min(arr[i - 1][j], (1 + arr[i][j
								- coins[i]]));
					}
				}
			}
		}

		return arr;
	}

	public static void main(String... commandLine) {
		Integer[] coins = { 1, 5, 6, 8 };
		Integer sum = 11;
		Integer[][] arr = coinChange(coins, sum);
		for (Integer[] val : arr) {
			for (Integer val1 : val) {
				out.print(val1 + " ");
			}
			out.println(" ");
		}
		out.println("Number of coins required are:  "
				+ arr[coins.length - 1][sum]);
	}
}

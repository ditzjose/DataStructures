package com.dynamic;

// 1 will have with consicutive 1's =>2
// 2  => 3
// 3 => 5
// Hence a fibnocci pattern is followed

// Stair case problem also uses fibnocci series
// to climb 2nd stair 2, 11 => 2
		// 3rd stair:111,21,12=>3
		// 4th stair:1111,211,121,113,22 => 5
		// Hence by using ibnocci series this problem also can be solved
public class NumberWithAndWithoutConsicutiveOne {
	public static Integer withoutOnes(Integer length) {
		Integer prev = 2;
		Integer next = 3;
		Integer curr = 0;
		for (Integer i = 2; i < length; i++) {
			curr = next + prev;
			prev = next;
			next = curr;
		}
		return curr;
	}

	public static void main(String... commandLine) {
		Integer number = 4;
		Integer valWithout = withoutOnes(number);
		Integer valWith = (number * number) - valWithout;

		System.out.println("Value without:  " + valWithout);
		System.out.println("Value with:  " + valWith);
	}
}

package com.tyss.myPro;

import java.util.Scanner;

public class PositiveNegitive10 {
	static int minChangesToValidString(String s) {
		int countStar = 0;
		int countHash = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				countStar++;
			} else if (s.charAt(i) == '#') {
				countHash++;
			}
		}

		return countStar - countHash;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = scanner.nextLine();
		int result = minChangesToValidString(s);
		System.out.println("Output:");
		if (result == 0) {
			System.out.println("The number of * and # are equal: 0");
		} else if (result > 0) {
			System.out.println("(* > #): " + result);
		} else {
			System.out.println("(# > *): " + result);
		}
		scanner.close();
	}
}
/*
 * Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The
 * length of the string is variable. The task is to find the minimum number of
 * ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the
 * number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in
 * the string. Note : The output will be a positive or negative integer based on
 * number of ‘*’ and ‘#’ in the input string.
 * 
 * (*>#): positive integer (#>*): negative integer (#=*): 0 Example 1: Input 1:
 * 
 * ###*** -> Value of S Output :
 * 
 * 0 → number of * and # are equal
 * 
 */

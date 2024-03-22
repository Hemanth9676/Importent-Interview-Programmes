package com.tyss.myPro;

import java.util.Scanner;

public class MoveHyphen2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String..");
		String input = sc.next();
		System.out.println(MoveHyphen(input));
	}

	public static String MoveHyphen(String str) {
		// Return null if str is null
		if (str == null) {
			return null;
		}

		StringBuilder result = new StringBuilder();
		StringBuilder hyphens = new StringBuilder();

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// If the character is a hyphen, add it to the hyphens StringBuilder
			if (c == '-') {
				hyphens.append(c);
			} else {
				// If the character is not a hyphen, add it to the result StringBuilder
				result.append(c);
			}
		}

		// Append the hyphens to the beginning of the result
		result.insert(0, hyphens.toString());

		return result.toString();
	}
}
/*
 * char*MoveHyphen(char str[],int n);
 * 
 * The function accepts a string “str” of length ‘n’, that contains alphabets
 * and hyphens (-). Implement the function to move all hyphens(-) in the string
 * to the front of the given string.
 * 
 * NOTE:- Return null if str is null.
 * 
 * Example :-
 * 
 * Input: str.Move-Hyphens-to-Front Output: —MoveHyphenstoFront Explanation:-
 * 
 * The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the
 * front of the string, this output is “— MoveHyphen”
 * 
 * Sample Input
 * 
 * Str: String-Compare Sample Output-
 * 
 * -StringCompare
 * 
 */

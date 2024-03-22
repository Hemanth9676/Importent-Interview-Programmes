package com.tyss.myPro;

import java.util.Scanner;

public class ReplaceChar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String..");
		String str = scn.nextLine();
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int length = ch.length;
		System.out.println("Enter ch1 char");
		char ch1 = scn.next().charAt(0);
		System.out.println("Enter ch2 char");
		char ch2 = scn.next().charAt(0);
		ReplaceChar r = new ReplaceChar();
		String result = r.replaceChar(ch, length, ch1, ch2);
		System.out.println(result);
	}

	private String replaceChar(char[] ch, int length, char ch1, char ch2) {
		for (int i = 0; i < length; i++) {
			if (ch[i] == ch1)
				ch[i] = ch2;
			else if (ch[i] == ch2)
				ch[i] = ch1;
		}
		return new String(ch);
	}

}
/*
 * You are given a function,
 * 
 * Void *ReplaceCharacter(Char str[], in`t n, char ch1, char ch2);
 * 
 * The function accepts a string ‘ str’ of length n and two characters ‘ch1’ and
 * ‘ch2’ as its arguments . Implement the function to modify and return the
 * string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string
 * are replaced by ‘ch2’ and all occurrences of ‘ch2’ in original string are
 * replaced by ‘ch1’.
 * 
 * Assumption: String Contains only lower-case alphabetical letters.
 * 
 * Note:
 * 
 * Return null if string is null. If both characters are not present in string
 * or both of them are same , then return the string unchanged. Example:
 * 
 * Input: Str: apples ch1:a ch2:p Output: paales Explanation:
 * 
 * ‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is
 * replaced with ‘a’, thus output is paales.
 * 
 */

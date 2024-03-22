package com.tyss.myPro;

public class Pssword3 {
	public static void main(String[] args) {
		String password1 = "aA1_67";
		String password2 = "a987 abC012";

		System.out.println(CheckPassword(password1.toCharArray(), password1.length())); // Output: 1
		System.out.println(CheckPassword(password2.toCharArray(), password2.length())); // Output: 0
	}

	public static int CheckPassword(char str[], int n) {
		// Check if the length is at least 4 characters
		if (n < 4) {
			return 0;
		}

		// Check if the starting character is not a number
		if (Character.isDigit(str[0])) {
			return 0;
		}

		boolean hasNumeric = false;
		boolean hasCapital = false;

		for (char c : str) {
			// Check for space or slash
			if (c == ' ' || c == '/') {
				return 0;
			}

			// Check for numeric digit
			if (Character.isDigit(c)) {
				hasNumeric = true;
			}

			// Check for capital letter
			if (Character.isUpperCase(c)) {
				hasCapital = true;
			}
		}

		// Check if at least one numeric digit and at least one capital letter exist
		if (!hasNumeric || !hasCapital) {
			return 0;
		}

		return 1;
	}
}
/*
 * You are given a function. int CheckPassword(char str[], int n); The function
 * accepts string str of size n as an argument. Implement the function which
 * returns 1 if given string str is valid password else 0. str is a valid
 * password if it satisfies the below conditions. • – At least 4 characters • –
 * At least one numeric digit • – At Least one Capital Letter • – Must not have
 * space or slash (/) • – Starting character must not be a number Assumption:
 * Input string will not be empty. Example: Input 1: aA1_67 Input 2: a987 abC012
 * Output 1: 1 Output 2: 0
 * 
 */

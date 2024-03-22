package com.tyss.myPro;

public class Binary2 {
	public static void main(String[] args) {
		String str = "1C0C1C1A0B1";
		int result = OperationsBinaryString(str);
		System.out.println(result); // Output: 1
	}

	public static int OperationsBinaryString(String str) {
		if (str == null || str.isEmpty()) {
			return -1;
		}

		char[] chars = str.toCharArray();
		int result = Character.getNumericValue(chars[0]); // Initialize result with the first binary digit
		for (int i = 1; i < chars.length; i += 2) {
			char operator = chars[i];
			char operand = chars[i + 1];

			switch (operator) {
			case 'A':
				result &= Character.getNumericValue(operand);
				break;
			case 'B':
				result |= Character.getNumericValue(operand);
				break;
			case 'C':
				result ^= Character.getNumericValue(operand);
				break;
			default:
				return -1; // Invalid operator
			}
		}

		return result;
	}
}
/*
 * 02. Problem Description: The Binary number system only uses two digits, 0 and
 * 1 and number system can be called binary string. You are required to
 * implement the following function: int OperationsBinaryString(char* str); The
 * function accepts a string str as its argument. The string str consists of
 * binary digits separated with an alphabet as follows: • – A denotes AND
 * operation • – B denotes OR operation • – C denotes XOR Operation You are
 * required to calculate the result of the string str, scanning the string to
 * right taking one operation at a time, and return the same. Note: • No order
 * of priorities of operations is required • Length of str is odd • If str is
 * NULL or None (in case of Python), return -1
 * 
 * Input: str: 1C0C1C1A0B1 Output: 1
 * 
 * Explanation: The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1
 * AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.
 * 
 */
package com.tyss.myPro;

import java.util.Scanner;

public class OperationChoice5 {

	int operationChoices(int c, int a, int b) {
		int result = 0;
		if (c == 1) {
			result = a + b;
		} else if (c == 2) {
			result = a - b;
		} else if (c == 3) {
			result = a * b;
		} else if (c == 4) {
			result = a / b;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter x value..");
		int x = scn.nextInt();
		System.out.println("Enter y value..");
		int y = scn.nextInt();
		System.out.println("Enter z value..");
		int z = scn.nextInt();
		OperationChoice5 o = new OperationChoice5();
		int result = o.operationChoices(x, y, z);
		System.out.println(result);
	}

}
/*
 * Int OperationChoices(int c, int n, int a , int b )
 * 
 * The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments.
 * Implement the function to return.
 * 
 * ( a+ b ) , if c=1 ( a – b ) , if c=2 ( a * b ) , if c=3 (a / b) , if c =4
 * Assumption : All operations will result in integer output.
 * 
 * Example:
 * 
 * Input c :1 a:12 b:16 Output: Since ‘c’=1 , (12+16) is performed which is
 * equal to 28 , hence 28 is returned. Sample Input
 * 
 * c : 2
 * 
 * a : 16
 * 
 * b : 20
 * 
 * Sample Output
 * 
 * -4
 * 
 */

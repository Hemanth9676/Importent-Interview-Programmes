package com.tyss.myPro;

import java.util.Scanner;

public class Function4 {
	int findCount(int n, int arr[], int num, int diff) {
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (Math.abs(arr[i] - num) <= diff) {
				count++;
			}
		}
		return count > 0 ? count : -1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a n");
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter a num");
		int num = scn.nextInt();
		System.out.println("Enter a diff");
		int diff = scn.nextInt();
		System.out.println((fun(n, arr, num, diff)));
	}

	public static int fun(int n, int[] arr, int num, int diff) {
		Function4 f = new Function4();

		return f.findCount(n, arr, num, diff);
	}

}
/*
 * int findCount(int arr[], int length, int num, int diff);
 * 
 * The function accepts an integer array ‘arr’, its length and two integer
 * variables ‘num’ and ‘diff’. Implement this function to find and return the
 * number of elements of ‘arr’ having an absolute difference of less than or
 * equal to ‘diff’ with ‘num’. Note: In case there is no element in ‘arr’ whose
 * absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.
 * 
 * Example: Input:
 * 
 * arr: 12 3 14 56 77 13 num: 13 diff: 2 Output: 3
 * 
 * Explanation: Elements of ‘arr’ having absolute difference of less than or
 * equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.
 * 
 * 
 */

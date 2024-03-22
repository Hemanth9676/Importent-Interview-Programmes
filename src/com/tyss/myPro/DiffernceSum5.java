package com.tyss.myPro;

import java.util.Scanner;

public class DiffernceSum5 {

	int differenceofSum(int n, int m) {
		int i, sum1 = 0, sum2 = 0;
		for (i = 1; i <= m; i++) {
			if (i % n == 0)
				sum1 = sum1 + i;
			else
				sum2 = sum2 + i;
		}
		if (sum2 > sum1)
			return sum2 - sum1;
		else
			return sum1 - sum2;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n value..");
		int n = scn.nextInt();
		System.out.println("Enter m value..");
		int m = scn.nextInt();
		DiffernceSum5 d = new DiffernceSum5();
		int result = d.differenceofSum(n, m);
		System.out.println(result);
	}

}
/*
 * def differenceofSum(n. m)
 * 
 * The function accepts two integers n, m as arguments Find the sum of all
 * numbers in range from 1 to m(both inclusive) that are not divisible by n.
 * Return difference between sum of integers not divisible by n with sum of
 * numbers divisible by n.
 * 
 * Assumption:
 * 
 * n>0 and m>0 Sum lies between integral range Example
 * 
 * Input n:4 m:20 Output 90
 * 
 * Explanation
 * 
 * Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60 Sum of numbers
 * not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17
 * + 18 + 19 = 150 Difference 150 – 60 = 90 Sample Input n:3 m:10 Sample Output
 * 19
 * 
 * 
 * 
 * Q6 def LargeSmallSum(arr)
 * 
 * The function accepts an integers arr of size ’length’ as its arguments you
 * are required to return the sum of second largest element from the even
 * positions and second smallest from the odd position of given ‘arr’
 * 
 * Assumption:
 * 
 * All array elements are unique Treat the 0th position as even NOTE
 * 
 * Return 0 if array is empty Return 0, if array length is 3 or less than 3
 * Example
 * 
 * Input
 * 
 * arr:3 2 1 7 5 4
 * 
 * Output
 * 
 * 7
 * 
 * Explanation
 * 
 * Second largest among even position elements(1 3 5) is 3 Second smallest among
 * odd position element is 4 Thus output is 3+4 = 7 Sample Input
 * 
 * arr:1 8 0 2 3 5 6
 * 
 * Sample Output
 * 
 * 8
 * 
 */

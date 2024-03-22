package com.tyss.myPro;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallestPair7 {

	int productSmallestPair(int[] array, int n, int sum) {
		int answer, temp, i, j, check;
		if (n < 2) {
			answer = -1;
		} else
			Arrays.sort(array);
		check = array[0] + array[1];

		if (check <= sum) {
			answer = array[0] * array[1];
		} else {
			answer = 0;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n value...");
		int n = scn.nextInt();
		System.out.println("Enter Array Values value...");
		int sum = scn.nextInt();
		System.out.println(sum);
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scn.nextInt();
		}
		ProductSmallestPair7 p = new ProductSmallestPair7();
		int result = p.productSmallestPair(array, n, sum);
		System.out.println(result);
	}

}
/*
 * def ProductSmallestPair(sum, arr)
 * 
 * The function accepts an integers sum and an integer array arr of size n.
 * Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such
 * that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k]
 * <= sum) and return the product of element of this pair
 * 
 * NOTE
 * 
 * Return -1 if array is empty or if n<2 Return 0, if no such pairs found All
 * computed values lie within integer range Example
 * 
 * Input
 * 
 * sum:9
 * 
 * size of Arr = 7
 * 
 * Arr:5 2 4 3 9 7 1
 * 
 * Output
 * 
 * 2
 * 
 * Explanation
 * 
 * Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2.
 * Thus, output is 2
 * 
 * Sample Input
 * 
 * sum:4
 * 
 * size of Arr = 6
 * 
 * Arr:9 8 3 -7 3 9
 * 
 * Sample Output
 * 
 * -21
 * 
 */

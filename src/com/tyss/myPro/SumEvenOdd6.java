package com.tyss.myPro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumEvenOdd6 {

	public static void main(String[] args) {
//		  int arr[] = { 3, 2, 1, 7, 5, 4 };
		int arr[] = { 1, 8, 0, 2, 3, 5, 6 };
		int length = arr.length;
		SumEvenOdd6 s = new SumEvenOdd6();
		int result = s.LargeSmallSum(arr, length);
		System.out.println(result);
	}

	private int LargeSmallSum(int[] arr, int length) {
		if (length <= 3 || arr == null) {
			return 0;
		}

		ArrayList evenPos = new ArrayList<>();
		ArrayList oddCount = new ArrayList<>();
		int k = 0;
		int l = 0;
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				evenPos.add(arr[i]);
			} else {
				oddCount.add(arr[i]);
			}
		}

		Collections.reverse(evenPos);
		Collections.sort(oddCount);
		int e = (int) evenPos.get(1);
		System.out.println(evenPos);
		System.out.println(oddCount);

		int e1 = (int) oddCount.get(1);
		int re = e + e1;
		return re;
	}

}
/*
 * You are required to implement the following Function def LargeSmallSum(arr)
 * The function accepts an integers arr of size ’length’ as its arguments you
 * are required to return the sum of second largest element from the even
 * positions and second smallest from the odd position of given ‘arr’
 * Assumption: • All array elements are unique • Treat the 0th position as even
 * NOTE • Return 0 if array is empty • Return 0, if array length is 3 or less
 * than 3 Example Input arr:3 2 1 7 5 4 Output 7 Explanation • Second largest
 * among even position elements(1 3 5) is 3 • Second smallest among odd position
 * element is 4 • Thus output is 3+4 = 7 Sample Input arr:1 8 0 2 3 5 6 Sample
 * Output 8
 * 
 */

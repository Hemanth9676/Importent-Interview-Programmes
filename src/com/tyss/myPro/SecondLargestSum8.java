package com.tyss.myPro;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSum8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size...");
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element in : " + i);
			arr[i] = scn.nextInt();
		}
		int even, odd;
		if (arr.length % 2 == 0) {
			even = arr.length / 2;
			odd = arr.length / 2;
		} else {
			even = (arr.length / 2) + 1;
			odd = arr.length / 2;
		}
		int[] evenArray = new int[even];
		int[] oddArray = new int[odd];
		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				evenArray[j++] = arr[i];
			else
				oddArray[k++] = arr[i];
		}
		Arrays.sort(evenArray);
		Arrays.sort(oddArray);
		int max = evenArray[evenArray.length - 2] + oddArray[oddArray.length - 2];
		System.out.println(max);
	}

}
/*
 * You are required to input the size of the matrix then the elements of matrix,
 * then you have to divide the main matrix in two sub matrices (even and odd) in
 * such a way that element at 0 index will be considered as even and element at
 * 1st index will be considered as odd and so on. then you have sort the even
 * and odd matrices in ascending order then print the sum of second largest
 * number from both the matrices
 * 
 * Example
 * 
 * enter the size of array : 5 enter element at 0 index : 3 enter element at 1
 * index : 4 enter element at 2 index : 1 enter element at 3 index : 7 enter
 * element at 4 index : 9 Sorted even array : 1 3 9 Sorted odd array : 4 7
 * 
 * 7
 * 
 * 
 */

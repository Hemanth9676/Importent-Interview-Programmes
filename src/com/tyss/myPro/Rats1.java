package com.tyss.myPro;

import java.util.Scanner;

public class Rats1 {

	int calculate(int r, int unit, int arr[], int n) {
		if (n == 0)
			return -1;
		int totalFoodRequired = r * unit;
		int foodTillNow = 0;
		int house = 0;
		for (house = 0; house < n; ++house) {
			foodTillNow += arr[house];
			if (foodTillNow >= totalFoodRequired) {
				break;
			}
		}
		if (totalFoodRequired > foodTillNow)
			return 0;
		return house + 1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter rats");
		int rats = scn.nextInt();
		System.out.println("Enter unit");
		int unit = scn.nextInt();
		System.out.println("Enter n");
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; ++i) {
			System.out.print("Enter a Element " + i);
			arr[i] = scn.nextInt();
		}
		food(rats, unit, arr, n);

	}

	public static int food(int rats, int unit, int[] arr, int n) {
		Rats1 r = new Rats1();
		System.out.println(r.calculate(rats, unit, arr, n));
		return 0;
	}

}
/*
 * Q1 Problem Description : The function accepts two positive integers ‘r’ and
 * ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’
 * represents the number of rats present in an area, ‘unit’ is the amount of
 * food each rat consumes and each ith element of array ‘arr’ represents the
 * amount of food present in ‘i+1’ house number, where 0 <= i Note:
 * 
 * Return -1 if the array is null Return 0 if the total amount of food from all
 * houses is not sufficient for all the rats. Computed values lie within the
 * integer range. Example:
 * 
 * Input:
 * 
 * r: 7 unit: 2 n: 8 arr: 2 8 3 5 7 4 1 2 Output:
 * 
 * 4
 * 
 * Explanation: Total amount of food required for all rats = r * unit
 * 
 * = 7 * 2 = 14.
 * 
 * 
 * The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st
 * 4 houses is sufficient for all the rats. Thus, output is 4.
 * 
 * 
 */

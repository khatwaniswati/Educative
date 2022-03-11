package com.array;

import java.util.Arrays;

class CheckSecondMax {

	public int findSecondMaximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondMax && arr[i] != max)
				secondMax = arr[i];
		}
		return secondMax;
	}

	public static int providedOptimizedFindSecondMaximum(int[] arr) {

		int max = Integer.MIN_VALUE;
		;
		int secondmax = Integer.MIN_VALUE;

		// Keep track of Maximum value, whenever the value at an array index is greater
		// than current Maximum value then make that max value 2nd max value and
		// make that index value maximum value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax && arr[i] != max) {
				secondmax = arr[i];
			}
		} // end of for-loop

		return secondmax;
	} // end of findSecondMaximum

	public static void main(String args[]) {

		int[] arr = { -2, -33, -10, -456 };

		System.out.println("Array: " + Arrays.toString(arr));

		int secMax = providedOptimizedFindSecondMaximum(arr);

		System.out.println("Second maximum: " + secMax);

	}
}
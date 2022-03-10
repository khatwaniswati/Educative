package com.array;

import java.util.Arrays;

class ProductArray {
	public static int[] findProduct(int arr[]) {
		int[] result = new int[arr.length];

		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
			if (arr[i] == 0)
				break;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				result[i] = product / arr[i];
			else {
				int product2 = 1;
				for (int j = 0; j < arr.length; j++) {
					if (i != j)
						product2 *= arr[j];
				}
				result[i] = product2;
			}
		}

		return result;
	}

	public static int[] myOptimizedFindProduct(int arr[]) {
		int n = arr.length;
		int i, temp = 1;

		// Allocation of result array
		int result[] = new int[n];
		int left[] = new int[n];
		int right[] = new int[n];
		
		// Product of elements on left side excluding arr[i]
		for (i = 0; i < n; i++) {
			left[i] = temp;
			temp *= arr[i];
		}

		// Initializing temp to 1 for product on right side
		temp = 1;

		// Product of elements on right side excluding arr[i]
		for (i = n - 1; i >= 0; i--) {
			right[i] = temp;
			temp *= arr[i];
		}
		
		//product of left side and right side
		for (i = 0; i < n; i++) {
			result[i] = left[i]*right[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
//		int[] arr = { 0, 1, 2 };
		int[] arr = { 1, 2, 3, 4 };
		int[] result = myOptimizedFindProduct(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] providedFindProduct(int arr[]) {
		int n = arr.length;
		int i, temp = 1;

		// Allocation of result array
		int result[] = new int[n];

		// Product of elements on left side excluding arr[i]
		for (i = 0; i < n; i++) {
			result[i] = temp;
			temp *= arr[i];
		}

		// Initializing temp to 1 for product on right side
		temp = 1;

		// Product of elements on right side excluding arr[i]
		for (i = n - 1; i >= 0; i--) {
			result[i] *= temp;
			temp *= arr[i];
		}

		return result;
	}
}
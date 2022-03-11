package com.array;

class CheckReArrange {

	public static void reArrange(int[] arr) {
		int posPtr = 0, negPtr = 0;
		while (posPtr < arr.length && negPtr < arr.length) {
			while (arr[posPtr] < 0)
				posPtr++;
			while (arr[negPtr] > 0)
				negPtr++;
			swap(arr, posPtr, negPtr);
			posPtr++;
			negPtr++;
		}
	}

	private static void swap(int[] arr, int posPtr, int negPtr) {
		int temp = arr[negPtr];
		arr[negPtr] = arr[posPtr];
		arr[posPtr] = temp;
	}

	public static void main(String args[]) {

		int[] arr = { 2, 4, -6, 8, -5, -10 };

		System.out.print("Array before re-arranging: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		reArrange(arr);

		System.out.print("Array after rearranging: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
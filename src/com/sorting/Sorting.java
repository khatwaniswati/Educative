package com.sorting;

class Sorting {
	static Helper obj = new Helper();

	public static void selectionSort(int[] arr, int arrSize) {
		int minInd;
		// traverse through all elements of the array
		for (int i = 0; i < arrSize; i++) {
			// find the minimum element in the unsorted array
			minInd = obj.findMin(arr, i, arrSize - 1);
			// Swap the found minimum element with the leftmost unsorted element
			int temp = arr[i];
			arr[i] = arr[minInd];
			arr[minInd] = temp;
		}
	}

	static void bubbleSort(int arr[], int arrSize) {
		int i, j, temp;
		// Traverse through all array elements
		for (i = 0; i < arrSize - 1; i++)
			// Last i elements are already in place
			for (j = 0; j < arrSize - i - 1; j++)
				// Traverse the array from 0 to size of array[i-1]
				// Swap if the element found is greater than the next element
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	static void insertionSort(int[] arr, int arrSize) {
		int ele, j;
		// Traverse through 1 to size of the array
		for (int i = 1; i < arrSize; i++) {
			ele = arr[i]; // Element to be inserted
			j = i - 1;

			// shifts elements back to create space for the element to be inserted
			while (j >= 0 && arr[j] > ele) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = ele;
		}
	}

	public static void main(String args[]) {
		int arr[] = { 5, 4, 1, 0, 5, 95, 4, -100, 200, 0 };
		int arrSize = 10;
		selectionSort(arr, arrSize);
		obj.printArray(arr, arrSize);
	}
}
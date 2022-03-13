package com.array;

class BinarySearch {
	static int binSearchUsingRecursion(int[] a, int key) {
		int high = a.length;
		int low = 0;
		return binSearchRecursive(a, key, low, high);
	}

	private static int binSearchRecursive(int[] a, int key, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (a[mid] == key)
			return mid;
		else if (a[mid] > key)
			return binSearchRecursive(a, key, low, mid - 1);
		else
			return binSearchRecursive(a, key, mid + 1, high);
	}

	static int binSearchUsingIterative(int[] a, int key) {
		int high = a.length;
		int low = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key)
				return mid;
			else if (a[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222 };
		System.out.println("binSearchUsingIterative:" + binSearchUsingIterative(arr, 47));
		System.out.println("binSearchUsingRecursion:" + binSearchUsingRecursion(arr, 47));
	}
}
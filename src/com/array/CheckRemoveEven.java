package com.array;

class CheckRemoveEven {

	public static int[] removeEven(int[] arr) {
		int[] result = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & 1) != 0) {
				result[j] = arr[i];
				j++;
			}
		}
		arr = new int[j];
		for (int i = 0; i < j; i++) {
			arr[i] = result[i];
		}
		return arr; // change this and return the correct result array
	}

	public static int[] providedRemoveEven(int[] arr) {
		int oddElements = 0;

		// Find number of odd elements in arr
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				oddElements++;
		}

		// Create result array with the size equal to the number of odd elements in arr
		int[] result = new int[oddElements];
		int result_index = 0;

		// Put odd values from arr to the resulted array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				result[result_index++] = arr[i];
		} // end of for loop

		return result;
	} // end of removeEven

	public static void main(String args[]) {

		int size = 10;
		int[] arr = new int[size]; // declaration and instantiation

		System.out.print("Before removing Even Numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; // assigning values
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] newArr = removeEven(arr); // calling removeEven

		System.out.print("After removing Even Numbers: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " "); // prinitng array
		}
	}
}
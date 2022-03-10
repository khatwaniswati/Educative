package com.array;

class CheckFirstUnique {
	public static int findFirstUnique(int[] arr) {
		int result = -1;
		for (int i = 0; i < arr.length ; i++) {
			int no = arr[i];
			boolean repeating = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[j] == no) {
						repeating = true;
						break;
					}
				}
			}
			if (!repeating) {
				result = no;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr= {4,5,1,2,0,4};
		//int[] arr = { 4, 4, 4, 3 };
		System.out.println(findFirstUnique(arr));
	}
}
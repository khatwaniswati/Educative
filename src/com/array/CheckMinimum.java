package com.array;

class CheckMinimum {

	public static int findMinimum(int[] arr) {
		int result=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<result)
				result=arr[i];
		}
		return result;
	}
}
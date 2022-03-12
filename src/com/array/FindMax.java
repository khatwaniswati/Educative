package com.array;

class FindMax {
	public static int findMaxSumSubArray(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for (int i = 0; i < arr.length; i++) {
			curSum += arr[i];
			if (curSum > maxSum)
				maxSum = curSum;
			if (curSum < 0)
				curSum = 0;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { -5, -13, -2, -4};
//		int[] arr = { 1, 7, -2, -5, 10, -1 };
		System.out.println(findMaxSumSubArray(arr));
	}
}
package com.recursion;

class IsPalindromeStringUsingRecursion {
	public static boolean isPalindrome(String text) {
		if (text.length() == 0 || text.length() == 1) {
			return true;
		} else {
			if (text.charAt(0) == text.charAt(text.length() - 1)) {
				return isPalindrome(text.substring(1, text.length() - 1));
			}
		}
		return false;
	}

	public static void main(String args[]) {
		String input1 = "daad";
		String input2 = "dadad";
		boolean answer1 = isPalindrome(input1);
		boolean answer2 = isPalindrome(input2);
		System.out.println("Is " + input1 + " a Palindrome? = " + answer1);
		System.out.println("Is " + input2 + " a Palindrome? = " + answer2);

		System.out.println(reverseString("Hello"));
		String input3 = "o";
		System.out.println(".." + input3.substring(1));
	}

	public static String reverseString(String myStr) {
		// Base case
		if (myStr.isEmpty()) {
			return myStr;
		}

		// Recursive case
		else {
			return reverseString(myStr.substring(1)) + myStr.charAt(0);
		}
	}

	public static int totalVowels(String text, int len, int index) {
		int count = 0;

		if (len == 0) {
			return 0;
		}
		char single = Character.toUpperCase(text.charAt(index));
		if (single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
			count++;
		}
		return count + totalVowels(text, len - 1, index + 1);
	}
}
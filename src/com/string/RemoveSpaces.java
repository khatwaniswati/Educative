package com.string;

class RemoveSpaces {
	static void removeWhiteSpaces(char[] s) {
		if (s == null || s.length == 0 || s[0] == '\0') {
			return;
		}
		int write_ptr = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != ' ' && s[i] != '\t') {
				s[write_ptr] = s[i];
				write_ptr++;
			}
		}
		s[write_ptr] = '\0';
	}

	static char[] getArray(String t) {
		char[] s = new char[t.length()];
		int i = 0;
		for (; i < t.length(); ++i) {
			s[i] = t.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "All greek  to me";
		char[] array = getArray(s);
		removeWhiteSpaces(array);
		System.out.println(array);
	}
}
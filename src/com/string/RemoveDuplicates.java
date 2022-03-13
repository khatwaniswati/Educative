package com.string;

import java.util.HashSet;

class RemoveDuplicates {
	static void removeDuplicates(char[] str) {
		HashSet<Character> set = new HashSet<>();
		int write_pos=0;
		for (int i = 0; i < str.length; i++) {
			if(!set.contains(str[i])) {
				set.add(str[i]);
				str[write_pos]=str[i];
				write_pos++;
			}
		}
		str[write_pos]='\0';
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
		String s="dabacc";
		char[] array = getArray(s);
		removeDuplicatesApproach2(array);
		System.out.println(array);
	}
	static void removeDuplicatesApproach2(char[] str) {
		if(str==null || str.length<2)
			return;
		int write_pos=0;
		for (int i = 0; i < str.length; i++) {
			boolean charFound=false;
			for (int j = 0; j < write_pos; j++) {
				if(str[j]==str[i]) {
					charFound=true;
					break;
				}
			}
			if(!charFound) {
				str[write_pos]=str[i];
				write_pos++;
			}
		}
		str[write_pos]='\0';
	}
}
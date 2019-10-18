package com.neeeraj.main;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "242";
		int i = 1;
		for (; i <= str.length(); i++) {
			if (str.charAt(i - 1) != str.charAt(str.length() - i)) {
				break;
			}
		}
		if ((i - 1) == str.length()) {
			System.out.println("string is palindrome");

		} else {
			System.out.println("string is not palindrome");
		}
	}

}

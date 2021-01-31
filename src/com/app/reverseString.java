package com.app;

public class reverseString {

	public static void main(String[] args) {

		/*
		 * String str = "Hello Good Morning"; StringBuffer stringBuffer = new
		 * StringBuffer(str); StringBuffer reverse = stringBuffer.reverse();
		 * System.out.println(reverse);
		 */
		
		String s="Hello";
		
		//char[] charArray = s.toCharArray();
		for(int i=s.length();i<s.length();i--) {
			char charAt = s.charAt(i);
			System.out.print(charAt);
		}
		

	}
}

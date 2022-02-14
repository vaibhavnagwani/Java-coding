package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {
	public static void main(String[] args)throws IOException {
		String str,str2 = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		str=br.readLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			char ch=str.charAt(i);
			str2+=ch;
		}
		if (str2.equals(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
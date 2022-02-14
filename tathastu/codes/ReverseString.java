package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		String str=br.readLine();
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			str2=ch+str2;
		}
		System.out.println("The reverse of string: "+str2);
	}
}

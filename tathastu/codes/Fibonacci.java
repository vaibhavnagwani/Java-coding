package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	public static void main(String[] args)throws IOException {
		int a=0,b=1,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter total of numbers to be displayed in fibonacci series:");
		int n = Integer.parseInt(br.readLine());
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
	}
}

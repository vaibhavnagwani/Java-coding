package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number whose factorial is to be calculated: ");
		int n=Integer.parseInt(br.readLine());
		int prod=1;
		if(n<0) {
			System.out.println("Enter positive number");
		}
		else if (n==0) {
			System.out.println("Factorial = 0");
		}
		else {
			while (n>0) {
				prod = prod*n;
				n--;
			}
			System.out.println(prod);
		}
		
	}
}

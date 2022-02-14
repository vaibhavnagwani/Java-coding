package com.tathastu.codes;

import java.io.*;

public class Calculator {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a,b;
		System.out.println("Enter two numbers on which operations are needed to be performed: ");
		a = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Modulus");
		System.out.println("Enter a number to perform associated operation on above inputs");
		int num = Integer.parseInt(br.readLine());
		switch (num) {
		case 1:
			System.out.println(a+b);
			break;
			
		case 2:
			System.out.println(a-b);
			break;
			
		case 3:
			System.out.println(a*b);
			break;
			
		case 4:
			System.out.println(a/b);
			break;
			
		case 5:
			System.out.println(a%b);
			break;

		default:
			System.out.println("Please provide proper input");
			break;
		}
	}

}

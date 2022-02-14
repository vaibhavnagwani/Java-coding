package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationAndCombination {
	
	public static int fact(int num) {
		int total=1;
		while(num>0) {
			total*=num;
			num--;
		}
		return total;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers: ");
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int permutation, combination;
		permutation=(fact(num1))/(fact(num1-num2));
		combination=(fact(num1))/(fact(num2)*(fact(num1-num2)));
		System.out.println("Permutation of the numbers: "+permutation+"\nCombination of the numbers: "+combination);
	}
}

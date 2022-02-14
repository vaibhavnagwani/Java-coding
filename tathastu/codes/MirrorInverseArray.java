package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorInverseArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of array elements");
		int len=Integer.parseInt(br.readLine());
		int arr[]=new int[len];
		boolean flag=true;
		System.out.println("Enter the array elements smaller than the number of elements");
		for (int i = 0; i < len; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		try {
			for (int i = 0; i < len-1; i++) {
				if(arr[arr[i]]==i) {
					flag=true;
				}
				else {
					flag=false;
				}
			}
			if(flag)
				System.out.println("The array is a Mirror Inverse Array");
			else {
				System.out.println("The array is not a Mirror Inverse Array");
			}
		}catch (IndexOutOfBoundsException e1) {
			System.out.println("Invalid input");
		}
		
	}
}

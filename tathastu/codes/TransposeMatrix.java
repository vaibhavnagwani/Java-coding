package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransposeMatrix {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows which is equal to columns of matrix: ");
		int x=Integer.parseInt(br.readLine());
		int[][] arr=new int[x][x];
		int[][] temp=new int[x][x];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("The original array: ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				temp[i][j]=arr[j][i];
			}
		}
		
		System.out.println("Transpose of the matrix: ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}
}

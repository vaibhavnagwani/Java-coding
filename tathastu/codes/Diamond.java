package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter width of diamond in terms of number of characters on the center(2n-1 rows will be printed): ");
		int n=Integer.parseInt(br.readLine());
		int space = n - 1;
		for (int i = 0; i < n; i++)
        {
			for (int j = 0; j < space; j++)
                System.out.print(" ");
			for (int j = 0; j <= i; j++)
                System.out.print("* ");
			 System.out.print("\n");
	            space--;
	        }
		space = 0;
		for (int i = n-1; i > 0; i--)
        {
			for (int j = 0; j < space+1; j++)
                System.out.print(" ");
			 for (int j = 0; j < i; j++)
	                System.out.print("* ");
	     
	            System.out.print("\n");
	            space++;
        }
	}
}
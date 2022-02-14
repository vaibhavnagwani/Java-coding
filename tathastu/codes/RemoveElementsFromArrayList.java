package com.tathastu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RemoveElementsFromArrayList {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements in the array list: ");
		int len=Integer.parseInt(br.readLine());
		
		ArrayList<Integer> al=new ArrayList<>(len);
		System.out.println("Enter "+len+" elements of arraylist: ");
		int n,rem;
		
		for(int i=0;i<len;i++) {
			n=Integer.parseInt(br.readLine());
			al.add(n);
		}
		
		System.out.println("The elements of the arraylist are: "+al);
		
		System.out.println("\nEnter the index of element you want to remove(Index starts from 0): ");
		rem=Integer.parseInt(br.readLine());
		al.remove(rem);
		
		System.out.println("The updated elements of the arraylist are: "+al);
	}
}

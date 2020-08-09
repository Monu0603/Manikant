package org.tcs;

import java.util.Scanner;

public class Multiplicationtable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Table upto");
		int i = sc.nextInt();
		
		for (int j = 1; j <= i; j++) {
			
			int c=j*n;
			System.out.println(n +"*" +j +"=" +c);
		}
		
		
	}

}

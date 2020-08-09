package org.tcs;

import java.util.Scanner;

public class Countofdigit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a,i=0,j=0;
		a=n;
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
			
		}
		System.out.println(count);
		
	}

}

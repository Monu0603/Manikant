package org.tcs;

import java.util.Scanner;

public class Swappingwithvar {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The numbers are");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping Numbers are");
		
		System.out.println(a);
		System.out.println(b);
	}

}

package org.tcs;

import java.util.Scanner;

public class Swappingwithoutvar {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a= sc.nextInt();
		b= sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping number is");
		System.out.println(a);
		System.out.println(b);
	}

}

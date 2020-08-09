package org.tcs;

import java.util.Scanner;

public class OddEven {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int in = sc.nextInt();
	
	if (in%2==0) {
		
		System.out.println("Even Number");
		
	}
	else 
	{
		System.out.println("Odd Number");
	}
	
	
}

}

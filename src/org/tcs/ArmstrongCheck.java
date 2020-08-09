package org.tcs;

import java.util.Scanner;

public class ArmstrongCheck {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0)
		{
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if (j==n) {
			
			System.out.println("Armstrong Number");	
		}
		else
		{
			System.out.println("Not a armstrong Number");
		}
		
	}

}

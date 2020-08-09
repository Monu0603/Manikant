package org.tcs;

import java.util.Scanner;

public class PalingdromCheck {
	public static void main(String[] args) {
		
		int a,i=0,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		a=n;
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
		if (j==n) {
			
			System.out.println("Number is palingdrom");
		}
		else
		{
			System.out.println("number is not palingdrom");
		}
	}

}

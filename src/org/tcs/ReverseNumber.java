package org.tcs;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int a,i=0,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number");
		int n = sc.nextInt();
		a=n;
		 while(a>0)
		 {
			 i=a%10;
		 	 j=(j*10)+i;
		 	 a=a/10;	
		 	 
	}
	
		 System.out.println(j);
}
}
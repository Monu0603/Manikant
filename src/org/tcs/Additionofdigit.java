package org.tcs;

public class Additionofdigit {
	
	public static void main(String[] args) {
		
		int a=12345;
		int i=0,j=0;
		
		while(a>0)
		{
			i=a%10;
			j=j+i;
			a=a/10;
		}
		
		System.out.println("Sum of digit is :"+j);
		 	
		
	}

}

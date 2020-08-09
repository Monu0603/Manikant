package org.tcs;

public class HighestNumber {
	
	public static void main(String[] args) {
		int a =100;
		int b=200;
		int c=300;
		int d=250;
		if (a>b && a>c && a>d ) {
			
			System.out.println("Greatest Number is :A" +a);
			
		}
		else if (b>a && b>c && b>d) {
			
			System.out.println("Greatest Number is :B" +b);
			
		}
		 else if (c>a && c>b &&c>d){
				System.out.println("Greatest Number is : C" +c);

		}
		else
		{
			System.out.println("Greatest Number is D" +d);
		}
		
	}
	

}

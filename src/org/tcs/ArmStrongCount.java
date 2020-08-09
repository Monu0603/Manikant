package org.tcs;

public class ArmStrongCount {
	
	public static void main(String[] args) {
		int count=0;
		for (int n = 1; n < 1000; n++) {
			
			int a,i=0,j=0;
			a=n;
			while(a>0)
			{
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
			}
			
			if (j==n) {
				System.out.println(n);
				count++;	
			}	
		}
		System.out.println("Count is :"+count);
		
	}

}

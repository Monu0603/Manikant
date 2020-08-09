package org.string;

public class Maximumaccuringcharacter {
	
	static final int ASCII_SIZE=256;
	public static char maxchar(String str) {
		
		int count[]=new int [ASCII_SIZE];
		int length = str.length();
		
		for (int i = 0; i < length; i++) {
			
			count[str.charAt(i)]++;
		}
		
		int max=-1;
		char result =' ';
		for (int i = 0; i < length; i++) {
			if (max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
						
						result=str.charAt(i);
			}
			
		}
		return result;	
	}
	public static void main(String[] args) {
		
		String s="mahanayak";
		char c = maxchar(s);
		System.out.println(c);
	}

}

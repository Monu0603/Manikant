package org.string;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s="Mallika";
		int length = s.length();
		for (int i = length; i >0 ; i--) {
			
			char charAt = s.charAt(i-1 );
			System.out.println(charAt);
			
		}
	}

}

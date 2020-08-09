package org.string;

public class New {
	
	public static void main(String[] args) {
		
		String s="Monu";
		StringBuilder str = new StringBuilder();
		str.append(s);
		StringBuilder reverse = str.reverse();
		
		System.out.println(reverse);
	}

}

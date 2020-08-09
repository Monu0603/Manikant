package org.string;

public class Removespace {
	
	public static void main(String[] args) {
		
		String s="My world will be beautiful";
		String[] split = s.split(" ");
		String n ="";
		for (int i = 0; i < split.length; i++) {
			
			n=n+split[i];
			
		}
		System.out.println(n);
	}

}

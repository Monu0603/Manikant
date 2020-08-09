package org.string;

import java.util.Arrays;

public class Anagaram {
	
	public static void main(String[] args) {
		
		String s="malli";
		String s1="malli";
		
		char[] c = s.toCharArray();
		char[] d = s1.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		String e = String.valueOf(c);
		String f = String.valueOf(d);
		
		if (e.equals(f)) {
			
			System.out.println("String is Anagaram");
			
		}
		else
		{
			System.out.println("String is not anagaram");
		}
	}

}

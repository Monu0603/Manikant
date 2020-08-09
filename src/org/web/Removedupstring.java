package org.web;

public class Removedupstring {

	public static void main(String[] args) {
		
		String s="sitaram";
		char[] c = s.toCharArray();
		int count=0;
		for (int i = 0; i < c.length; i++) {
			
			for (int j = i+1; j < c.length; j++) {
				
				if (c[i]==c[j]) {
					
					System.out.println(c[j]);
					count++;
					break;
				}
				
			}
			
		}
	}


}

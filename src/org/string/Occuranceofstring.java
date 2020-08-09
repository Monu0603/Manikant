package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occuranceofstring {

	
	public static void main(String[] args) {
		
		String s="Mahakaleshwar";
		char[] c = s.toCharArray();
		
		Map<Character,Integer>  mp = new LinkedHashMap<>();
		for (char d : c) {
			
			if (mp.containsKey(d)) {
				
				Integer i = mp.get(d);
				mp.put(d,i+1);
				
			}
			else
			{
				mp.put(d, 1);
			}
			
		}
		System.out.println(mp);
	}
}

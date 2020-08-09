package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Countofword {
	
	public static void main(String[] args) {
		
		String s="My life my place my dream my hobby";
		
		String[] f = s.split(" ");
		
		for (int i = 0; i < f.length; i++) {
			
			System.out.println(f[i]);
		}
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		for (String c : f) {
			
			if (mp.containsKey(c)) {
				
				Integer i = mp.get(c);
				
				mp.put(c, i+1);
				
			}
			else
			{
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

}

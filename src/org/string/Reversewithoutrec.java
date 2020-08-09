package org.string;

public class Reversewithoutrec {
	
	public  static String Reversestring(String str)
	{
		if(str.isEmpty())
			return str;
		
		return Reversestring(str.substring(1))+str.charAt(0);	
	}
	public static void main(String[] args) {
		
		String s="My life is beautiful";
		String reverse = Reversestring(s);
		System.out.println(reverse);
	}

}

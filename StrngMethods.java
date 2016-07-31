package com.New;

public class StrngMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// starts with
		String[] words = { "fail", "far", "fresh", "freight", "bail" };
		for (String w : words) {
			if (w.startsWith("fa")) {
				System.out.println(w + " " + "starts with fa");
			}
		}
		// string ends with
		for (String w : words) {
			if (w.endsWith("il")) {
				System.out.println(w + " " + "ends with il");
			}

		}
// concatenation 
		String a = "bacon";
		String b = "   MONSTER   ";
		System.out.println(a.concat(b));

	String in = "robertmundavimundavirobert";
	System.out.println(in.indexOf('b',5));
	//System.out.println(b.replace('M', 'g'));
	System.out.println(a.toUpperCase());
	//System.out.println(b.toLowerCase());
	System.out.println(b.trim());
	}
	
	
}

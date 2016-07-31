package com.New;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(fact(4));
		System.out.println(fact(4));
	}

	/*
	 * public static long fact(long n) { if (n <= 1) return 1; else return n *
	 * fact(n - 1); }
	 */

	public static long fact(long f) {
		if (f <= 1)
			return 1;
		else
			return f * fact(f - 1);

	}

}

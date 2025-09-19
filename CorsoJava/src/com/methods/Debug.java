package com.methods;

public class Debug {

	public int somma(int a, int b) {

		return a + b;

	}

	public int divisione(int c, int d) {

		return c / d;

	}

	public static void main(String[] args) {

		Debug debug = new Debug();

		int a = 5;
		int b = 3;
		int c = 8;
		int d = 4;

		System.out.println(debug.somma(a, b));
		System.out.println(debug.divisione(c, d));

	}

}

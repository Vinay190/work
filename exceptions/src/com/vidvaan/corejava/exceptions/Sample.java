package com.vidvaan.corejava.exceptions;

class Sample {
	public static void main(String[] args) {
		System.out.println("manoj");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("catch block");
		} finally {
			System.out.println("this is final method");
		}
		stuff();

	}

	static void stuff() {
		doStuff();

	}

	static void doStuff() {
		doMoreStuff();
	}

	static void doMoreStuff() {
		System.out.println("hello");
	}
}

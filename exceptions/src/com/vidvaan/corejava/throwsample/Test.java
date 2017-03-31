package com.vidvaan.corejava.throwsample;

public class Test extends RuntimeException {
	public static void main(String[] args) {
		throw new Test();
	}

}

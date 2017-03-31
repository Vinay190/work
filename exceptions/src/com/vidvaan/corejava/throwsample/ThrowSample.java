package com.vidvaan.corejava.throwsample;

public class ThrowSample {
public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		if(i==6){
			throw new RuntimeException();
		}
		System.out.println(i);
	}
}
}

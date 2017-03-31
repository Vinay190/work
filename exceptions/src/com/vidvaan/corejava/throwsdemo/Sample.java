package com.vidvaan.corejava.throwsdemo;

class Sample{
	public static void main(String[] args)throws InterruptedException {
		stuff();
	}
static void stuff()throws InterruptedException
{
	doStuff();
}
static void doStuff()throws InterruptedException
{
	Thread.sleep(1000);
	System.out.println("sleep method");
}
}

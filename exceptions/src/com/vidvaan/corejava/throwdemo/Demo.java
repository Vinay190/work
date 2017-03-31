package com.vidvaan.corejava.throwdemo;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

class Demo{
	private int accno=888385513;
	private String name="manoj";
	double bal=50000;
	int wd;
	public void set(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter acc no");
		accno=s.nextInt();
		System.out.println("enter acc holder name");
		name=s.next();
	}
	void match(){
		try{
			if(name!="manoj"&&accno!=888385513){
				Error e = null;
				throw new RuntimeErrorException(e);
			}}
		finally{
				System.out.println("name and accno not matched");
			}
		}
	void balCheck(){
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("enter withdrawl amount");
			int wd=s.nextInt();
			if(wd>bal){
				Error e=null;
				throw new RuntimeErrorException(e);
			}}
			finally{
				System.out.println("insufficient funds");
			}
		}
	void trans(){
		 bal=bal-wd;
		 System.out.println("the avail bal is:"+bal);
	}
}

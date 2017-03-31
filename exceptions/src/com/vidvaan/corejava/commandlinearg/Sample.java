package com.vidvaan.corejava.commandlinearg;

class Sample {
	public static void main(String[] args) {
		try {
			System.out.println("open files");
			int n = args.length;
			System.out.println(n);
			double a = n / 45;
			System.out.println(a);
			int[] x={2,3};
			x[4]=2;
			
		} catch (ArithmeticException e) {
			System.out.println("pass data");}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("please enter the valid array");
			
		}
		finally {
			System.out.println("close files");
		}
	}
}

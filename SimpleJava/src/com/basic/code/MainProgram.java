package com.basic.code;

public class MainProgram {

	public MainProgram() {
		System.out.println("Constructor is called..");
	}
	
	public static void main(String[] args) {
		
		MainProgram mp = new MainProgram();
		
		CalledProgram call = new CalledProgram();
		
		int v1 = call.add(5,2);
		System.out.println("Addition is " + v1);
		
		double d = call.mul(7.2,4.6);
		System.out.println("Multiplication is " + d);
			
	}
}
package com.instagram.login;

public class Relationaloperators {
	public static void main(String[]args) {
		int a=10;
		int b=20;
		boolean f= a>b;
		System.out.println(f);
		
		//bitwise operator: always check next value
		System.out.println(false & false);
		System.out.println(true | false);
		
		//short circuit operator: does not check next value
		//System.out.println(false && false);
		System.out.println(false || true);
		
		//ternary operator
		String c =(a>b)? "a is greater": "b is greater";
		System.out.println(c);
		
		
	}
  
}

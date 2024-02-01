package com.instagram.login;

public class Method {
	int a=10;
    int b=20;

	public void addition() {
		int c=a+b;
		System.out.println(c);
		
	}
	public void substraction() {
		int d=a-b;
		System.out.println(d);
	}
	public void multiplication() {
		int e=a*b;
		System.out.println(e);
	}
	public void division() {
		int f=a/b;
		System.out.println(f);
	}
	public static void main(String[]args) {
		Method calc = new Method();
		calc.addition();
		calc.substraction();
		calc.multiplication();
		calc.division();
		
			}
	
}

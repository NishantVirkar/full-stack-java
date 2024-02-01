package com.poly.compiletime;

public class Demo {
	public static void m1() {
		System.out.println("no para");
	}
	
	public static void m1(int a) {
		System.out.println("int para");
	}
	public static void main(String[] args) {
		Demo.m1();
		Demo.m1(0);
	}

}
//for static class.
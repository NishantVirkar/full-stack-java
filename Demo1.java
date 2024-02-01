package com.poly.compiletime;

public class Demo1 {
	public Demo1() {
		System.out.println("no para");
	}
	public Demo1(int a) {
		System.out.println("with para");
	}
	public static void main(String[] args) {
		Demo1 m1 = new Demo1();
		Demo1 m2 = new Demo1(0);
	}

}
//for constructor object based
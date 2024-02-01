package com.poly.compiletime;

public class First {
	public void m1() {
		System.out.println("no parameters");
	}
	
	public void m1(int a) {
		System.out.println("int para");
	}
	
	public void m1(String a) {
		System.out.println("string para");
	}
	public static void main(String[]args) {
		First ft = new First();
		ft.m1();
		ft.m1(10);
		ft.m1("abc");
	}

}
//inheritance is not compulsory for compile time polymorphism
//it is also called over loading
//it is same as matching things with name.
//different parameters, functions and name.
//constructor can be overload.
//static can be over load.
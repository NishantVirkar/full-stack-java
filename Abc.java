package com.instagram.login;

public class Abc {
	public static void xyz() {
		System.out.println("inside m1");
		
	}
	public void mno() {
		System.out.println("inside m2");
	}
	public static void main(String[]args) {
		
		Abc obj=new Abc();
		obj.mno();
		Abc.xyz();
		Abc.xyz();
		
		
	}

}
//Static: uses key word static; does not need to create object specifically; static can be called by using non static but non-static cannot be called using static method.
//it is class based.
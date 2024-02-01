package com.instagram.login;

import com.poly.compiletime.Demo1;

public class Method2 {
	public Method2() {
		System.out.println("inside constructor");	
	}
	
	public static void main(String[]args) {
		Method2 m1 = new Method2();
	}

}
//Constructors:
//it is  special type of method.
//name same as class name.
//**no return type .
//access specifier is present.
//object creation is required for execution of constructor.
//while executing output static>non static> constructor.
//static block can be executed only at one time.
//non static and constructor can be repeatedly executed by creating objects
//object based
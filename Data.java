package com.instagram.login;

public class Data {
	static {
		System.out.println("inside static block");
	}
	public static void main(String[]args) {
		System.out.println("inside main block");
		Abc.xyz();
		Abc obj=new Abc();
		obj.mno();
	}

}
//if main and static block are in same class then static block will be executed first.
//class can be called in different classes of same packages.
//class can be called in different package class by importing the class for eg:import packagename.classname/*;
//for calling static block,and non static block in different class of same packages we need to create a object, it will print according to the sequence.
// we cannot import in different projects.
//for creating non static block we do not need a keyword for eg: {........}. 
package com.b;
//throws is used to declare exception
//this exception can be handled later
//we can use multiple throws for exception
//file input stream is used for file handling
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C {
	public void m1() throws FileNotFoundException {
		FileInputStream fs = new FileInputStream("E:\\python");
	}
	
	public void m2() throws FileNotFoundException {
		m1();
	}
	public void m3() {
		try {
			m2();
		}
		catch(Exception e){
			System.out.println("handled");
		}
	}
	
	public static void main(String[] args) {
		C ab =new C();
		ab.m3();
	}
	

}

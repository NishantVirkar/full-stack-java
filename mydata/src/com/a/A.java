package com.a;
//exception:- throwable class is in java.lang package.
//when exception is found it is called death of screen.
//try and catch block is used to handle exception 
//reason for exception is entered in try block
//if exception occurs then it will move to catch block
//according to diagram parent class can handle child class exception.
//the classes which extends exception are called compile time exception.
//the classes which extends runtime exception are called run time exception
//try catch block must be used simultaneously.
//after parent class child class cannot be used it will show unreachable code.
//for example:- catch(Exception e){} catch(RuntimeException r){}.
//but vice versa is possible.
public class A {
	public static void main(String[] args) {
		//arithmetic exception
		int a= 10;
		int b = 0;
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("cant divide by zero");
		}
		
		//array index out of bounds exception
		int d[] = {10,20,30};
		try {
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("data not available");
		}
		
		//number format exception
		try {
		String k = "nishant";
		int l = Integer.parseInt(k);
		System.out.println(l);
		}
		catch(Exception e){
			System.out.println("String cannot be converted into number");
		}
		
		
	}
	


}

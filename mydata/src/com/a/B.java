package com.a;
//in try and catch after exception occurs next line of codes cannot be run.
//to run next lines of code finally keyword block is used.

public class B {
	public static void main(String[] args) {
		int a= 10;
		int b = 10;
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("cant divide by zero");
		}
		finally {
			System.out.println("next code");
		}
	}

}

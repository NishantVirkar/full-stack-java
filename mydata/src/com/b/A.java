package com.b;
// throw key word is used for intentionally use of exception
// it can be handled by using try and catch block
//it is used in try block.

public class A {
	public static void main(String[] args) {
		try {
			//line of code
			throw new B();
			//bug code
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
	}

}

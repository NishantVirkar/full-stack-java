package com.abstraction;

public interface Coach {
	public String getSalary();
	
	public static void getBonus() {
		System.out.println("100000");
		
	}
	

}
//interface:
//to achieve 100% abstraction 
//we can use static method from java 8
//interface to class= implements
//interface to interface= extends
//it is used so that no method is skipped
//we have to import package and use extends keyword.

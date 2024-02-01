package com.abstraction;

public abstract class College {
	public void collegeName() {
		System.out.println("kbp");//non abstract
	}
	
	public abstract void getClasses();//abstract is extended in department

}
//abstraction:
//we have to declare that the class can use abstraction
//we can achieve 0 to 100% through abstract keyword and 100% through interface
//we can extend the class by using abstract keyword or extending the function/over riding it.
//inheritance and overriding can be done by using abstraction 
//error can be removed by using abstract in class or by extending the abstract for child class.
//abstraction is used to hide the functions 
//Final:
//final keyword is used for security.
//final is object based.
//final ,static, constructor and abstract cannot be used again.
//final in class prevents inheritance.
//final in method prevents overriding.
//final can be access in another class and private cannot be access in another class. 
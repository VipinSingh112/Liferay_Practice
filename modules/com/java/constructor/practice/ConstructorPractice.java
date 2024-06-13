package com.java.constructor.practice;

/*
 * What is a constructor?
 * 1.Constructor is a method use to initialize the object of  object  -- refer line no 1
 * 2.It has no return type
 * 3.Name of Constructor is Same as Class
 * 
 * */

public class ConstructorPractice {
//constructor is called when an instance of class is created
	// At time of calling constructor memory for object is allocated
	// every time a object is created using the new () keyword at least one
	// constructor is called
	// if there is no constructor the default constructor is called
	/*
	 * two types of constructor are 1.Parameterized 2.Non Parameterized
	 */

	/*
	 * WE CAN USE THA ACCESS MODIFIERS DURING DECLERATION OF IT PUBLIC PRIVATE
	 * DEFAULT PROTECTED DOES NOT HAVE EXPLICIT RETURN TYPE
	 */
	public static void main(String[] args) {
		System.out.println("Class A Called");
		MyConstructorCall call=new MyConstructorCall("Vipin Singh Kalra","9760370995");
	}

}

class MyConstructorCall {
	String name;
	String number;
	public MyConstructorCall(String name, String mobNum) {
		this.name=name;
		this.number=mobNum;
		System.out.println("name---"+name);
		System.out.println("number---"+number);
	}
	
	
}

class DemoPracticeConstructor {
 MyConstructorCall call=new MyConstructorCall("","");
}

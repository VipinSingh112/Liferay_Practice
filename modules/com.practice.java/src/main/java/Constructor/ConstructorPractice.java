package Constructor;
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
		DefaultConstructorExample constructorExample = new DefaultConstructorExample();// this is a default constructor
																						// of class Default constructor
																						// class}
		/*
		 * 
		 * default constructor/non parameterised constructor
		 * 
		 */
	}

}

class DefaultConstructorExample {
	public static void methodeDemo() {
	}

}

class ParameterisedConstructorExample {
	 static String name;
	int mobileNum=0;

	/*
	 * 
	 *  parameterised 
	 *  constructor
	 *  example */
	public ParameterisedConstructorExample(String name) {
		this.name=name;
		this.mobileNum=1;

	}
	public static void main() {
		ParameterisedConstructorExample constructorExample=new ParameterisedConstructorExample("Vipin");
		constructorExample.name="Singh";
		System.out.println("main----"+name);

	}

}

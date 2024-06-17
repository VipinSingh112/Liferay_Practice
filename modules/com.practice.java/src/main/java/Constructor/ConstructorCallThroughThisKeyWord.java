package Constructor;

/*
 * We can call constructor inside constructor  by the use of this keyword
 * 
 * 
 * */

public class ConstructorCallThroughThisKeyWord {

	public ConstructorCallThroughThisKeyWord() {
		this("vipin", "29", "Brahmpuri", 976037099);
	}

	public ConstructorCallThroughThisKeyWord(String name, String age, String address) {
		System.out.println("Name---------" + name);
		System.out.println("Age---------" + age);
		System.out.println("Address---------" + address);
	}

	protected ConstructorCallThroughThisKeyWord(String name, String age, String address, int mobNUmber) {
		System.out.println("Name---------" + name);
		System.out.println("Age---------" + age);
		System.out.println("Address---------" + address);
		System.out.println("Mobile Number---------" + mobNUmber);
	}

	public static void main(String[] args) {
		ConstructorCallThroughThisKeyWord callThroughThisKeyWord = new ConstructorCallThroughThisKeyWord();
	}

}

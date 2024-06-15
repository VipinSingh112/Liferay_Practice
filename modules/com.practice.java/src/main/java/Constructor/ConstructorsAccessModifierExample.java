package Constructor;

/*
 * 
 *  we can use access modifiers
 *  with constructors
 *  Public Protected Private(default)
 *  */
public class ConstructorsAccessModifierExample {
	/* 
	 *
	 * USING PUBLIC ACCESS MODIFIER
	 * 
	 *  */
	String nam;
	String ag;
	String add;
	public ConstructorsAccessModifierExample() {
		int age=29;
		String name="Vipin";
		System.out.println("Public Constructor is called");
	}

	/* 
	 * 
	 * private cant access out of peckage
	 * 
	 *  
	 *  
	 *  */
	private ConstructorsAccessModifierExample(String name,String age) {
	this.nam=name;
	this.ag=age;
	System.out.println("Name----"+this.nam);
	System.out.println("Age----"+this.ag);
	
	}

	/*
	 * 
	 *  protected used within a class
	 *  
	 *   
	 *   */
	protected ConstructorsAccessModifierExample(String name,String age,String address) {
		this.nam=name;
		this.ag=age;
		this.add=address;
		System.out.println("Name-----"+this.nam);
		System.out.println("Age-----"+this.ag);
		System.out.println("Address-----"+this.add);
	} 
	public static void main(String[] args) {
		ConstructorsAccessModifierExample accessModifierExample=new ConstructorsAccessModifierExample("Vipin","29");
		ConstructorsAccessModifierExample accessModifierExample2=new ConstructorsAccessModifierExample("Vipin","29","Brahmpuri");
	
	}
}

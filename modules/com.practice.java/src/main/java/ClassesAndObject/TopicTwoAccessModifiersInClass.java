package ClassesAndObject;
/* there should be one public class in java source code
 * 
 * if source code has multiple public nethods then the compiler will be confused so thats why it search for public method which is one in SC this class has a same name as 
 * source file name
 * 
 * */
	/*
	 * We can decleare AccessController only 
	3
	1 .is public 
	2 .is abstractnn
	3 .is final*/

	/*we cna use the protected modifier and private modifier in nested class*/
	public class TopicTwoAccessModifiersInClass {
	
	//USAGE oF Constructor  Start ------------------------------------
		private TopicTwoAccessModifiersInClass(String x, int y) {
			this("Name", "Age");
			System.out.println("Name--" + x + "\nAge--" + y);
		}
	
		public TopicTwoAccessModifiersInClass() {
			this("Name of Person", 19);
		}
	
		protected TopicTwoAccessModifiersInClass(String x, String y) {
		}
	//USAGE oF Constructor  End ------------------------------------
		

		private class DemoClass{
			String name ="Hi i am  a demo class";

		public void main(String[] args) {
			System.out.println("name---" + name);
		}			
		}
		// creating new class using protected accesss modifier
		protected class DemoClass1{
			public  void main(String[] args) {
				System.out.println("Hi i am protected inner class");
			}
		}

	int a = 0;
	public static void main(String[] args) {
		TopicTwoAccessModifiersInClass accessModifiersInClass = new TopicTwoAccessModifiersInClass();
		TopicTwoAccessModifiersInClass.DemoClass accessModifiersInClassCallingDemoClass=accessModifiersInClass.new DemoClass();
		//private class or inner class should be instantiated like this
		String name = accessModifiersInClassCallingDemoClass.name;
		
		TopicTwoAccessModifiersInClass.DemoClass1 class1=accessModifiersInClass.new DemoClass1();
		class1.main(null);
	}
	}

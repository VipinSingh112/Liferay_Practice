package ClassesAndObject;
// ---Usage of final keyword in method level 
// we can inherit class Topic5UsageOfFinalKeywordMethodLevel on DemoOfFinalMethodLevel
//same as in inner classes
public class Topic5UsageOfFinalKeywordMethodLevel {
	final void getAnswer() {
		System.out.println("Hi-----I Am in Final Method");
	}
	void setAnswer(String yourAnswer) {
		
	}
	
	public class Parent {
		final  int setNUmber(int num) {
			
			return num;}
	}
	
	public  class Child extends Parent{
		
		/* int setNUmber(int num) {} */
		
		
		public  void main(String[] args) {
			
		}
	}
	
	
	
	
	
	

}
class DemoOfFinalMethodLevel extends Topic5UsageOfFinalKeywordMethodLevel{
	
	public static void main(String[] args) {
		DemoOfFinalMethodLevel demoOfFinalMethodLevel=new DemoOfFinalMethodLevel();
		demoOfFinalMethodLevel.setAnswer("Answer is A");
	}
	
	/*cannot be over ridden because of final keyword in Parent Class
	 * public void getAnswer() { System.out.println("Hi "); }
	 */
	@Override
	 void setAnswer(String answer) {
		System.out.println("hello");
	}// allowed----1
	
}

package ClassesAndObject;
//USAGE OF FINAL KEYWORD IN TOP LEVEL OF CLASSES

/*POINT 1 ---If We Create a class with final keyword it cannot be a subclass
 * Proof of Point 1---1
 * IF FINAL KEYWORD IS USED IN INNNER CLASSES SAME WE ANNOT SUBCLASS IT TO OTHER STATIC CLASS OR INNER CLASS
 * Proof----2
 * 
 * */

//public class TopicFourUsageOfFinalKeyWordinTopLevel extends DemoOfFinalInTopLevel {//---1
  public class TopicFourUsageOfFinalKeyWordinTopLevel{		
public static void getAnswer() {
			String name="Vipin";
			int age=0;	
			float averageScore=0;
		}

	/* 
	 * public static class Demo3 extends Demo{} -----2
	 * 
	 * */
	final class Demo{}
	//	public class Demo2 extends Demo{}//---showing error because it is final and cannot be subclass--------2
	}
	final class DemoOfFinalInTopLevel {
		public static void main(String[] args) {
			System.out.println("This is a Final Class");
		}
	}

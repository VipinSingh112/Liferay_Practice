package ClassesAndObject;

public class TopicThreeUsageOfStatickeywordInClassLevel {
	
	/*
	 *  THIS IS A INNER CLASS WITH STATIC KEYWORD 
	 *  WE CAN CREATE A STATIC INNER CLASS 
	 *  
	 *  Point 1-Static Nested Class Can Access The Static Member Of Outer Class Directly But to Access instance member of outer we need to instantiate it 
	 *  proof of point num 1---1,2,3
	 *  Popint 2-Non Static Class/Inner Class Need to instanciate the Outer Class to access the Outer members  can access all the field and methods which is static or not
	 *  proof of point num 2--4
	 *  POint 3 We cannot create a method statis if class is not decleare static
	 *  proof of point num 3---5
	 *  */
	static int number = 0;/*---1*/
	String name=null;
	
	public static void getAnswer() {
		System.out.println("Answer is 1");
	}
	
	public static class DemoOfStatic{//----2
		int v=9;
		public static void showingDemo() {
			int a=0;
			System.out.println("Demo is called inside Demo Static");
			number=15;//--3
			TopicThreeUsageOfStatickeywordInClassLevel classLevel=new TopicThreeUsageOfStatickeywordInClassLevel();//---3
			String name = classLevel.name;//---3
		}
		
	}
	
	
	public class UsageInnerClass{//----4
		public  void main(String[] args) {
			getAnswer();
			name="Vipin";
			number=9760370;
			DemoOfStatic  demoOfStatic=new DemoOfStatic();
			demoOfStatic.showingDemo();
			DemoOfStatic.showingDemo();
		}
	}
	public static class DemoOfStatic2{//----5
		public static void main(String[] args) {
			
		}
		
		
	}
	 public class DemoOfStaticUsage extends DemoOfStatic{
		 
	 }
	//CALLING A DEMO OF STATIC WITHOUT INSTANCIATING 
	public static void main(String[] args) {
		DemoOfStatic.showingDemo();
	}

}

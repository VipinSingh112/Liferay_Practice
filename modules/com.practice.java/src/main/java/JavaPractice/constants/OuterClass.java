package JavaPractice.constants;

import JavaPractice.constants.OuterClass.StaticClass.InnerClass;

//top class level class modifiers
//----------------------------------------------------
/*public class Bike{public static void main(String[] args) {}}
class Bike1{}
abstract class Bike2{}
final class Bike3{}*/
//----------------------------------------------------
/*
 *
 * Static class and Inner Classes
 *
 */
public class OuterClass {
	public static int a;
	String name;

	public static void main(String[] args) {
		StaticClass class1 = new StaticClass();
		class1.main(null);
		StaticClass.InnerClass class2 = class1.new InnerClass();
		class2.main(null);
		String[] playerNames= {"MS Dhoni(wk)(c)","R.Jadeja"
				,"S.Tendulkar","Rishab Pant","YET TO Be Announce"};
		Child child=new Child(playerNames);
	}

	static class StaticClass {
		static int a = 4;

		public static void main(String[] args) {
			a = 12;
			OuterClass class1 = new OuterClass();
			class1.name = "Vipin";
			System.out.println("Static Class is called--" + class1.name);
		}

		protected class InnerClass {
			public void main(String[] args) {
				OuterClass class1 = new OuterClass();
				a = 2;
				class1.name = "Vipin";
				OuterClass.StaticClass class2 = new StaticClass();
				class2.a = 23;
				System.out.println("----A-----" + a);
			}
		}

	}
}

class Parent {

	public Parent(String[] platerNamesArray) {
		playingXIPlayer(platerNamesArray);
	}

	final void playingXIPlayer(String[] playerNamesArray) {
		for (int i = 0; i < playerNamesArray.length; i++) {
		int b=	i + 1;
		
			System.out.println("[Name of " + (i + 1) + " player is :" + playerNamesArray[i]);
		}
	}

}

class Child extends Parent {
	
	public Child(String[] platerNamesArray) {
		super(platerNamesArray);
	}

	public void playingXI(String[] arr) {
	}
	/* void playingXIPlayer(String[] arr) {} */// -----cant be possible
}

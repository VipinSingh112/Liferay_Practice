package ClassesAndObject;
/*reference--https://docs.oracle.com/javase/tutorial/java/concepts/class.html
*/

/*Q-What is object?
 *A-softwarenobject is similat to real world object --Example if we see our Dogs have state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
 *Similarly object have state which is (variables
 *)
 *and behaviours is methods
 * 
 * 
 * Q-What is Class?
 * A-A Class is a blue print from which the objects are created
 * 
 * 
 * */

//-----------------------------------------------------------------------------------//
/*Example of Class
 * This class does not have a main method as it is a blue print that applicable in application
 * 
 * 
 * */
 class BikeMechanism {
	String nameOfBike = "";
	String colourOfBike = "";
	String gearOfBIke = "";
	String speed = "";
	String average = "";
	String speedDecrement = "";

	public void setNameOfBike(String nameOfBike) {
		this.nameOfBike = nameOfBike;
	}

	public String getNameOfBike() {
		return this.nameOfBike;
	}

	public String bikeNameAverageCalculation(String bikeName) {
		if(bikeName.equals("YAMAHA")){
			return "45";
		}
		if(bikeName.equals("DISCOVERY")) {
			return "55";
		}
		return null;

	}

	public void setColourOfBike(String colourOfBike) {
		this.colourOfBike = colourOfBike;
	}

	public String getColourOfBike() {
		return this.colourOfBike;
	}

	public void setGearOfBike(String gearOfBike) {
		this.gearOfBIke = gearOfBike;
	}

	public String getGearOfBike() {
		return this.gearOfBIke;
	}

	public void setSpeedOFBike(String speedOfBike) {
		this.speed = speedOfBike;
	}

	public String getSpeedOfBike() {
		return this.speed;
	}

	public void setApplyingBreak(String speedDecrement) {
		this.speedDecrement = speedDecrement;
	}

	public String getSpeedAfterApplyingBrake() {
		return this.speedDecrement;
	}

	public String hormMechanism() {
		return "Beep";
	}
	
}
//-----------------------------------------------------------------------------------//
 //blue print i.e class is used in bike adn states and behaviour is manipulated using object
 
 public class TopicOneClassBike{
	public static void main(String[] args) {
		BikeMechanism bike=new BikeMechanism();//Constructor called and object is created
		bike.setNameOfBike("YAMAHA");
		bike.setColourOfBike("GREY");
		bike.setGearOfBike("5");
		bike.setSpeedOFBike("200");
		bike.setApplyingBreak("50");
		
		System.out.println("Name of Bike---"+bike.getNameOfBike());
		System.out.println("Colour of Bike---"+bike.getColourOfBike());
		System.out.println("Gear of Bike---"+bike.getGearOfBike());
		System.out.println("Speed of Bike---"+bike.getSpeedOfBike());
		System.out.println("Horn Mechanism of Bike---"+bike.hormMechanism());
		System.out.println("Applying Brake Speed Decrement of Bike---"+bike.getSpeedAfterApplyingBrake());
	}
}


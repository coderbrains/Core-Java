package constructor;

class Vehicle {
	int wheels, headlights;
	String color;
	public Vehicle(int wheels , int headlights , String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.headlights = headlights;
		this.wheels = wheels;
		
	}
	
	public Vehicle(int wheels , int headlights) {
		
		this.headlights = headlights;
		this.wheels = wheels;
	}
	
	public void desCription() {
		
		System.out.println("Color = " + color + " number of headlights = " + headlights + 
				" and the number of wheels = " + wheels);
		
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
}
public class AllCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle scooty = new Vehicle(2,  1);
		scooty.color = "Silver plating";
		scooty.desCription();
		
		Vehicle car = new Vehicle(4, 2, "Blue black");
		car.desCription();
		
//		Vehicle autonomous = new Vehicle();
	}

}

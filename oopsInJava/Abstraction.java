package oopsInJava;

abstract class Car{
	public abstract void honking();
	public abstract void braking();
	
	public void a() {
		System.out.println("The car is  running in its full its speed ");
	}
}

class Scooty extends Car{

	@Override
	public void honking() {
		// TODO Auto-generated method stub
		
		System.out.println("The scooty is honking");
		
	}

	@Override
	public void braking() {
		// TODO Auto-generated method stub
		
		System.out.println("The scooty is braking.");
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scooty scooty = new Scooty();
		
		scooty.a();
		scooty.braking();
		scooty.honking();

	}

}

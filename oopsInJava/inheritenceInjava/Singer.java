package oopsInJava.inheritenceInjava;

public class Singer extends Person{

	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void sing() {
		System.out.println( name + " is singing");
	}
}

package oopsInJava.inheritenceInjava;

public class Teacher extends Person {
	
	public Teacher(String name) {
		// TODO Auto-generated constructor stub
		
		super(name);
		
		System.out.println("Inside teacher constructor");		
		
	}

	public void teach() {
	
		System.out.println(name + " is teaching");
	}
}

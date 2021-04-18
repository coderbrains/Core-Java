package oopsInJava.inheritenceInjava;

public class Person {
	
	String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
	this.name = name;
	System.out.println("Inside Person Constructor");
		
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	
	public void walk() {
		System.out.println(name + " is walking");
	}

}

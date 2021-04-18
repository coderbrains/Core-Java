package oopsInJava;

import java.util.Scanner;

class Cat{
	String breed;
	String name;
	
	public void eat() {
		System.out.println("The cat " + name + " is eating");
	}
	
	public void sleep() {
		System.out.println("The cat name = " + name + " is sleeping" + " and the breed of the cat is "+ breed + "");
		
	}
}

class Dog{
	String breed;
	String name;
	
	public void eat() {
		System.out.println("The Dog " + name + " is eating");
	}
	
	public void sleep() {
		System.out.println("The Dog name = " + name + " is sleeping" + " and the breed of the breed is "+ breed + "");
		
	}
}

public class Intro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dog d = new Dog();
		d.breed = "husky";
		d.name = "Hello Puppy";
		d.eat();
		d.sleep();
		
		
		Cat c = new Cat();
		c.name = "Jio";
		c.breed = "Mrs";
		c.sleep();
		c.eat();
	}

}

package oopsInJava;

import java.util.Scanner;
class A{

	int nos,id;
	String name;
	
	public void description() {
		System.out.println("Hello " + name + ".How are you?" + " I think your age  is "
	+ nos + " " + id );
	}
}

public class ObjectMaking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		A a = new A();
		a.id = 12;
		a.name = "Awanish";
		a.nos = 23;
		a.description();
	}
}

package oopsInJava;
import oopsInJava.StatiClass.B;

public class Abstatic {
	

	public static void main(String[] args) {
		
		StatiClass statiClass = new StatiClass();

		oopsInJava.StatiClass.A a = statiClass.new A();
		B b = new StatiClass.B();

		System.out.println(a.a);
		System.out.println(b.b);
	}
}

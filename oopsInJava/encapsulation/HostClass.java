package oopsInJava.encapsulation;

public class HostClass {

	public static void main(String[] args) {
		
		MainClass mainClass = new MainClass();
		mainClass.setA(12);
		mainClass.setB(13);
		System.out.println(mainClass.getA());
		System.out.println(mainClass.getB());

	}

}

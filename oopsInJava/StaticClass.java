package oopsInJava;

public class StaticClass {
	

	static {
		System.out.println("This is satatic block 1");
	}
	static{
		System.out.println("This is static block 2");
	}
	
	{
		System.out.println("This is the initiallzer block");
	}
	public static void main(String[] args) {
		
		
	}
	
	static {
		System.out.println("This is static block after the main class");
	}
}

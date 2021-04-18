package exceptionHandlling;

public class ThrowKey {

	public static void main(String[] args) {
		
		
		int a = 12;
		int b = 3;
		int c = a / b;
		System.out.println(c);
		
		
		
		boolean isDanger = true;
		
		/*
		 * Apna exception agar bhejna ho to ham throw keyword ka use karte hain
		 * isse agar apka condition satisfy hota hai to 
		 * user ke pass exception jayega hi jayega
		 */
		
		if(isDanger) {
			throw new ArithmeticException("Danger is coming to nearby");
		}

	}

}

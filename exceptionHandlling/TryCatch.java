package exceptionHandlling;

public class TryCatch {

	public static void main(String[] args) {
		
		
		try {
			int a = 12;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage() + " occured , when you perform the divide operation between a and b");
		}
	
		System.out.println("Very Important code");
		System.out.println("Should run");
	}

}

package exceptionHandlling;

public class FInallyKey {

	public static void main(String[] args) {
		
		try {
			int a = 12;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(IndexOutOfBoundsException e) {}
		catch(IllegalAccessError e) {}
		catch(ArrayStoreException e) {}
		finally {
			System.out.println("Finally");
			
		}
		
		/*
		 * Finally akele rah sakta hai
		 * lekin ek se jyada finally nahi rah sakta
		 * lekin ek se jyada catch rah sakta hai
		 * finally  ke bad catch nahi rah sakta 
		 * okk ::))
		 */
		

	}

}

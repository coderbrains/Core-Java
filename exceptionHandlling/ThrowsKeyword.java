package exceptionHandlling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
//		fun1();
		
		fun3();

	}
	
	
	static void fun3() {
		System.out.println("Before sleep");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After sleep");
	}
	
	static void fun1() {
		
		System.out.println("Hello");
		
		try {
			fun2();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	static void fun2()throws ArithmeticException {
		
		boolean isDanger = true;
		if(isDanger) {
			throw new ArithmeticException("Danger is coming to nearby");
		}
	}

}

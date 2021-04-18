package oopsInJava;

public class PassByValue {

	public static void main(String[] args) {
		
		int x = 12;
		int y = 13;
		swap(x,y);
		
		System.out.println(x + " " + y);
	}
	
	public static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}

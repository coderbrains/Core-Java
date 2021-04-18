package oopsInJava;

class Ref{
	
	int check;
}
public class PassByRef {
	
	public static void swap(Ref r1 , Ref r2) {
		Ref temp = r1;
		r1 = r2;
		r2 = temp;
	}

	public static void main(String[] ar) {
		Ref r1 = new Ref();
		r1.check = 12;
		Ref r2 = new Ref();
		r2.check = 13;
		swap(r1  , r2 );
		System.out.println(r1.check + " " + r2.check);
	}
	
}

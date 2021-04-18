package oopsInJava;

class Pair<X,Y>{
	
	X x;
	Y y;
	
	public void insertObj(X x , Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void Print() {
		System.out.println(x + " " + y);
	}
}


public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<String , Integer> pair = new Pair<String , Integer>();
		pair.insertObj("Awanish", 12);
		pair.Print();
	}

}

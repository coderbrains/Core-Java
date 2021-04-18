package constructor;

class A{
	String name;
	A(String name){
		this.name = name;
	}
	
	public void desc() {
		System.out.println("The name of the student is : " + name);
	}
}
public class ArgumentCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A("Awanish");
		a.desc();
	}

}

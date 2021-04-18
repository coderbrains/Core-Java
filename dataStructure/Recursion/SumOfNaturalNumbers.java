package dataStructure.Recursion;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1));

	}
	
	static int sum(int n) {
		if(n ==1) {
			return 1;
		}else if(n <= 0) {
			return n;
		}
		else {
			return sum(n-1) + n;
		}
	}

}

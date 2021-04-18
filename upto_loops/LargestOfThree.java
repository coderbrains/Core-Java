package upto_loops;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int a = 121;
		int   b = 13;
		int c = 10001;
		
//		if(a > b && a > c) {
//			System.out.println(" a is the largest");
//		}else if(b > a && b > c) {
//			System.out.println("b is the largest");
//		}else {
//			System.out.println("c is the largest");
//		}
		
		int max = (a > b && a > c) ? a : ((b > c && b > a) ? b : c);
		
		System.out.println(max);
		
		
	}
}

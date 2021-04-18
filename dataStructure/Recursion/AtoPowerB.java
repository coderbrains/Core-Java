package dataStructure.Recursion;

public class AtoPowerB {
	
	static int stepCount = 0;
	
	static int fastPower(int x, int y) {
		stepCount++;
		
		if(y==0) {
			return 1;
		}else if(y % 2 == 0) {
			return fastPower(x * x, y/2);
		}else {
			return x * fastPower(x, y - 1);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(power(1 , 10000));
		System.out.println("Step Count = " + stepCount);
		
		stepCount = 0;
		
		System.out.println(fastPower(1, 10000));
		System.out.println("Step Count = " + stepCount);

	}
	
	static int power(int x , int y) {
		
		stepCount++;
		if(y == 0) {
			return 1;
		}else {
			return x * power(x , y - 1);
		}
	}
	
	

}

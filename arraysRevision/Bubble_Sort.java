package arraysRevision;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-1 , 2 , 12, 10 , 0 , -10 , -100 , -1};
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			
			boolean sorrted = true;
			
			for(int j = 0 ; j < arr.length - 1 - i  ; j++) {
				if(arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorrted = false;
				}
			}
			if(sorrted) {
				break;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}

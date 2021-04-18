package dataStructure;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlist<Integer> queue = new Linkedlist<Integer>();
		
		queue.offer(142);
		queue.offer(512);
		queue.offer(312);
		queue.offer(122);
		queue.offer(121);
		queue.poll();queue.poll();queue.poll();queue.poll();queue.poll();//queue.poll();queue.poll();queue.poll();
		System.out.println(queue.peek());
		
	}

}

package dataStructure;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add("Kiwi");
		priorityQueue.add("Mango");
		priorityQueue.add("Pineapple");
		priorityQueue.add("Orange");
		priorityQueue.add("Apple");
		priorityQueue.add("Banana");
		
		
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue.remove());

	}

}

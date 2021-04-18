package dataStructure;

public class Linkedlist<E> {
	
	class Node{
		
		E data;
		Node next;
		
		public Node(E data) {
			// TODO Auto-generated constructor stub
		
			this.data = data;
			next = null;
		}
	}
	
	Node head = null;
	
	void push(E data) {
		Node toAdd = new Node(data);
		
		if(head == null) {
			head = toAdd;
		}else {
			toAdd.next = head;
			head = toAdd;
		}
	}
	
	E pop() {
		
		if(head==null || head.next == null) {
			System.out.println("You are in the empty stack so nothing popped");
			head = null;
			return null;
		}else {
			Node temp;
			temp = head;
			head = head.next;
			return temp.data;
		}
		
	}
	
	E peek() {
		if(head == null) {
			System.out.println("Empty Stack");
			return null;
		}else {
			return head.data;
		}
		
	}

	void offer(E data) {
		
		Node toAdd = new Node(data);
		
		if(head == null) {
			head = toAdd;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
	}

	
	E poll() {
		if(head==null || head.next == null) {
			System.out.println("You are in the empty stack so nothing popped");
			head = null;
			return null;
		}else {
			Node temp = head;
			head = head.next;
			return head.data;
		}
	}

	

}












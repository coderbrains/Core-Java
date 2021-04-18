package dataStructure.dequeue;

public class MyDequeue<E> {
	
	class Node<E>{
		
		E data;
		Node<E> next= null , prev=null;
		
		public Node(E data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			prev = null;
			next = null;
		}
		
	}

	Node<E> rear = null;
	Node<E> front = null;
	
	void addFront(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(front == null) {
			front = toAdd;
			toAdd.prev = front;
			rear = toAdd;
			toAdd.next = rear;
		}else {
			Node<E> temp = front;
			toAdd.next = front;
			front = toAdd;
			toAdd.prev = front;
			temp.prev = toAdd;
			rear.next = front;
		}
	}

	void print() {
		Node<E> temp = front;
		
		if(front == null) {
			System.out.println("This is a null dequeue");
		}else if(front == rear) {
			System.out.println(temp.data);
		}else {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}while(temp!=front);
		}
		
		
	}

	E removeFirst() {
		
		if(front == null) {
			rear=null;
			System.out.println("This is a null Queue");
			return null;
		}else if(front.next == front) {
			Node<E> Temp = front;
			front = rear = null;
			return Temp.data;
			
		}else {
			Node<E> temp = front;
			front = front.next;
			front.prev = front;
			rear.next = front;
			return temp.data;
		}
	}
	
	E removeLast() {
		
		if(rear == null) {
			System.out.println("This is a null dequeue");
			front = rear = null;
			return null;
		}else if(rear.next == rear && rear.prev==rear) {
			E data = front.data;
			rear = front = null;
			return data;
		}else {
			Node<E> temp = rear;
			rear = rear.prev;
			rear.next = front;
			return temp.data;
		}
	}

	
	void addLast(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(front == null) {
			front = rear = toAdd;
			toAdd.next = toAdd.prev = front;
		}else {
			toAdd.next = front;
			toAdd.prev = rear;
			rear.next = toAdd;
			rear = toAdd;
		}
	}

}

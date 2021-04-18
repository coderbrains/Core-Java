package dataStructure;

public class Stack {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
		
			this.data= data;
			next = null;			
		}
	}
	
	Node head = null;
	
	void push(int data) {
		Node toAdd = new Node(data);
		if(head==null) {
			head = toAdd;
		}else {
			Node temp = head;
			toAdd.next = head;
			head = toAdd;
		}
	}
	
	void printAll() {
		Node temp = head;
		if(temp == null) {
			System.out.println("This is an empty stack");
		}else {
			do {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}while(temp != null);
		}
	}
	
	int pop() {
		Node temp = head;
		head = head.next;
		return temp.data;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack stack = new Stack();
		
		for(int i = 0 ; i < 10 ; i++) {
			stack.push(i);
		}
		
//		stack.push(12);
//		stack.push(56);
		stack.printAll();
		System.out.println();
		System.out.println();
		int a = stack.pop();
		System.out.println(a);
		
		
		System.out.println();
		System.out.println();
		stack.printAll();
		

	}

}

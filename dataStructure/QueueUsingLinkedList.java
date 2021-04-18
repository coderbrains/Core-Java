package dataStructure;

public class QueueUsingLinkedList {
	
	 class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
		this.data = data;
		next = null;
		}
	}
	
	Node Head = null;
	
	void add(int data) {
		
		Node toAdd = new Node(data);
		if(Head == null) {
			Head = toAdd;
		}else {
			Node temp = Head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			
			temp.next = toAdd;
		}
	}
	
	void printAll() {
		Node temp = Head;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}while(temp != null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
		
//		for(int i = 0 ; i < 10 ; i++) {
//			queueUsingLinkedList.add(i);
//		}
		
		queueUsingLinkedList.add(20);
		queueUsingLinkedList.add(24);
		queueUsingLinkedList.add(56);
		
		queueUsingLinkedList.printAll();
	}

}

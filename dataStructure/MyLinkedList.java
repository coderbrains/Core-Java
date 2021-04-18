package dataStructure;



public class MyLinkedList {

	static class Node{
	
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head = null;
	public void addNode(int data) {
		Node toAdd = new Node(data);
		Node temp = head;
		
		if(head == null){
			head = toAdd;
		}else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
		
		
	}

	
	public  void  printAll() {
		
		Node temp = head;
		do {
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp !=null);
	}
	
	void addStart(int data) {
		Node toAdd = new Node(data);
		toAdd.next = head;
		head = toAdd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList m = new MyLinkedList();
		
//		m.addNode(20);
//		m.addStart(0);
//		m.addNode(30);
//		m.addNode(10);
//		m.addNode(2);
//		m.addStart(2333);
//		m.addStart(2121);
		
		for (int i = 0 ; i < 20 ; i++) {
			m.addNode(i);
			m.addStart(i);
		}
		m.printAll();
		
	}

}

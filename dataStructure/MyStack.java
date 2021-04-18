package dataStructure;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist<Integer> ll = new Linkedlist<>();
		
		ll.pop();
		ll.push(90);
		ll.push(24);
		ll.push(23);
		ll.push(45);
		ll.push(12);
		ll.push(234);
		
		System.out.println(ll.peek());
		ll.pop();
		System.out.println(ll.peek());
		ll.pop();
		System.out.println(ll.peek());
		ll.pop();
		System.out.println(ll.peek());
		ll.pop();
		System.out.println(ll.peek());
		ll.pop();
		System.out.println(ll.peek());
		ll.pop();
		System.out.println(ll.peek());
	}

}

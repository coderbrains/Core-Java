package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The String to checkfor the balanced : ");
		String input = scanner.nextLine();
		
		char[] c = input.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < c.length ; i++) {
			if(stack.empty()) {
				stack.push(c[i]);
			}else if(c[i] == '(' || c[i] == '{' || c[i] == '['){
				stack.push(c[i]);
			}else {
				if(c[i] == ')' && stack.peek() == '(') {
					stack.pop();
				}else if(c[i] == '}' && stack.peek() == '{') {
					stack.pop();
				}else if(c[i] == ']' && stack.peek() == '[') {
					stack.pop();
				}else {
					stack.push(c[i]);
				}
			}
		}
		
		if(stack.empty()) {
			System.out.println("This is a balanced input ");
		}else {
			System.out.println("This is not a baanced input");
		}

	}

}

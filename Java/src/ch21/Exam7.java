package ch21;

import java.util.Stack;

public class Exam7 {
	public static void main(String[] args) {
		String s = "hello";
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch : s.toCharArray()) {
			stack.push(ch);
		}

		while(stack.size() >0) {
			System.out.print(stack.pop());
		}
	}
}

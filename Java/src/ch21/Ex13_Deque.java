package ch21;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex13_Deque {
	public static void main(String[] args) {
		Deque<String> deq = new LinkedList<>();
		
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
		System.out.println("-------------------");
		
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		
		System.out.println("-------------------");
		
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
	}
}

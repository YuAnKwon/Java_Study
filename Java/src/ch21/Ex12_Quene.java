package ch21;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Quene {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		que.offer("A");
		que.offer("B");
		que.offer("C");
		System.out.println(que.size());
		
		// 다음에 뭐가 나올지 확인 
		System.out.println("next : " + que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());
		
		System.out.println("next : " + que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());
		
		System.out.println("next : " + que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());
		
	}
}

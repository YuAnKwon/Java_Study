package ch21;

import java.util.LinkedList;
import java.util.Queue;

public class Exam6 {
	public static void main(String[] args) {
	    int N = 6;
	    Queue<Integer> queue = new LinkedList<>();
	    
	    for(int i=1; i<=N; i++) {
	    	queue.offer(i);
	    }
	    
	    while(queue.size() > 1) {
	    	queue.poll();
		    	int card = queue.peek();
		    	queue.poll();
	    	queue.offer(card);
	    }
	    System.out.println("마지막에 남는 카드 : " + queue.peek());
	}
}

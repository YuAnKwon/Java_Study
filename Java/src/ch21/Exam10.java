package ch21;

import java.util.*;

public class Exam10 {
	public static void main(String[] args) {
	    String s = "swiss";
	    Map<Character, Integer> freq = new HashMap<>();
	    Set<Character> result = new HashSet<>();
	    
	    for(char ch : s.toCharArray()) {
	    	freq.put(ch, freq.getOrDefault(ch,0) + 1);
		}
	    	
		for(Map.Entry<Character, Integer> e : freq.entrySet()) {
			if(e.getValue() == 1) {
				result.add(e.getKey());
			}
		}
		System.out.println(result);
	}
}

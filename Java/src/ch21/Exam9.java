package ch21;

import java.util.*;

public class Exam9 {
	public static void main(String[] args) {
		String str = "hi, my name is donghee. nice to meet you";
		Map<Character, Integer> map = new HashMap<>();

		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0) + 1);
		}
		int maxValue = 0;
		char maxKey = ' ';
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
			if(e.getValue() > maxValue && e.getKey() != ' ') {
				maxValue = e.getValue();
				maxKey = e.getKey();
			}
		}
		System.out.println("가장 많이 등장한 문자: " + maxKey);
	}

}

package ch21;

import java.util.*;

public class Ex15_HashMapKeySet {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 20);
		map.put("전우치", 25);
		map.put("손오공", 27);
		
		Set<String> ks = map.keySet();
		
		for(String s : ks) {
			System.out.print(s + '\t');
		}
		System.out.println();
		
		for(String s : ks) {
			System.out.print(map.get(s).toString() + '\t');
		}
		System.out.println();
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + e.getValue());
		}
	}
}

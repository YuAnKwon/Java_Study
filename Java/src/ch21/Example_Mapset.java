package ch21;

import java.util.*;

public class Example_Mapset {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 4, 7, 3, 5, 5, 4, 3, 1, 6 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : nums) {
			int i = map.getOrDefault(n, 0); // 키가 존재하지 않으면 0 반환. 있으면 키 반환.
			map.put(n, i+1); // 이래나 저래나 1 또는 키+1 put 할 수 있음.
		}
		
		int max_key = 0;
		int max_value = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+ " : " + e.getValue() + "개");
			if( e.getValue() > max_value) {
				max_value = e.getValue();
				max_key = e.getKey();
			}
		}
		System.out.println("가장 많이 등장한 수 : " +max_key );
		
	}
}

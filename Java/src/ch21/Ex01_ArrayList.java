package ch21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		
		// 첫번째 객체 삭제
		list.remove(0);
		
		// 삭제 후 객체 참조
		for(String str : list) {
			System.out.print(str +'\t');
		}
		System.out.println();
		
		
	}
}

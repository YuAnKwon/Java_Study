package ch21;

import java.util.HashSet;
import java.util.Set;

public class Ex06_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("orange");
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("orange");
		
		System.out.println(set.size());
		
		
		for(String s : set) {
			System.out.print(s + "\t");
		}
	}
}

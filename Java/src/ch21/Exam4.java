package ch21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exam4 {
	public static void main(String[] args) {
		String[] strArr = { "apple", "banana" };
		Set<Character> set = new HashSet<>();
		
		for(String str : strArr){
			for(char ch : str.toCharArray()) {
				set.add(ch);
			}
			System.out.printf(str + " --> " + set);
			System.out.println();
			set.clear();
		}
	}
}

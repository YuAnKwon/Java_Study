package ch21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam3 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
		Set<Integer> result = new HashSet<>();
		
		for(Integer num : set1) {
			if(set2.contains(num)) {
				result.add(num);
			}
		}
		System.out.println(result);
	}
}

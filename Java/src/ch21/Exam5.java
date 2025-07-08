package ch21;

import java.util.TreeSet;

public class Exam5 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 4, 7, 3, 5, 5, 4, 3, 1, 6 };
		TreeSet<Integer> tree = new TreeSet<>();
		for(int num : nums) {
			tree.add(num);
		}
		System.out.println(tree);
	}
}

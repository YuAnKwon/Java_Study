package ch15;

import java.util.Arrays;

public class exam4 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Arrays.fill(arr, 3);
		
		for(int num : arr) {
			System.out.print(num);
		}
		System.out.println();
	}
}

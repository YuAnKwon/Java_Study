package ch15;

import java.util.Arrays;

public class Ex13_arrayEquals {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);

		boolean bCheck = checkEquals(arr1, arr2);
		System.out.println(bCheck);
	}

	private static boolean checkEquals(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}

		}
		return true;
	}
}

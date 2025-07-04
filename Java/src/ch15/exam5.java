package ch15;

import java.util.Arrays;

public class exam5 {
	public static void main(String[] args) {
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copied = origin; // 얕은 복사
		copied[0] = 10;

		System.out.println("-------origin----------");
		for (int num : origin) {
			System.out.print(num);
		}
		System.out.println();
		System.out.println("---------얕은 복사----------");
		for (int num : copied) {
			System.out.print(num);
		}
		
		int[] copied2 = Arrays.copyOf(origin, origin.length);
		copied2[0] = 100;
		System.out.println();
		System.out.println("---------깊은 복사----------");
		for (int num : copied2) {
			System.out.print(num);
		}
	}
}

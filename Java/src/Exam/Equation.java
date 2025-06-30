package Exam;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a값을 입력하세요 --> ");
		int a = sc.nextInt();

		System.out.print("b값을 입력하세요 --> ");
		int b = sc.nextInt();

		System.out.print("c값을 입력하세요 --> ");
		int c = sc.nextInt();

		for (int x = 0; x <= c; x++) {
			for (int y = 0; y <= c; y++) {
				if (a * x + b * y == c) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}

	}

}

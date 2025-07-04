package ch16;

import java.util.Scanner;

public class Ex02_TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num1 = sc.nextInt();
			int num2 = 10 / num1;
			System.out.println(num2);
			System.out.println("Good bye~!");
		} catch (Exception e) {
			// String str = e.getMessage();
			System.out.println("예외 발생");

		}
		System.out.println("끝");

	}
}

package ch04;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 1 2 3 입력하고 엔터");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("1입력");
		int num4 = sc.nextInt();

		System.out.println("2입력");
		int num5 = sc.nextInt();
		
		System.out.println("3입력");
		int num6 = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
	}
}

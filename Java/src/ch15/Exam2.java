package ch15;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
//		String input = sc.nextLine();
		
//		for(int i=input.length()-1; i>=0; i--) {
//			output += input.charAt(i);
//		}
//		
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sb.reverse();
		output += sb;
		
		System.out.println(output);
		sc.close();
	}
}
/*
입력받은 문자열을 거꾸로 뒤집어 변수[output]에 담아
출력하는 프로그램을 작성하라
단, StringBuilder의 reverse()메서드는 사용하지 않는다.
예시)
입력 : abcde
출력 : edcba
*/
package Exam;

import java.util.Scanner;

public class Reader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1년동안 읽은 책 수를 알려주세요 ! --> ");
		int num = sc.nextInt();
	
		switch(num/10) {
			case 0:
				System.out.println("조금 더 노력하세요");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이시네요!");
				break;
			case 2: 
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			default:
				System.out.println("당신은 다독왕입니다");
				break;
		}
		sc.close();
	}
}

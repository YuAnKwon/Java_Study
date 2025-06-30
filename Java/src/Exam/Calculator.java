package Exam;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요 --> ");
		int buyPrice = sc.nextInt(); // 구매금액
		int disPrice; // 할인액
 		
		if(buyPrice >=300000) {
			disPrice = 30000; 
		} else if(buyPrice >=100000) {
			disPrice = 5000;
		} else {
			disPrice = 0;
		}
		
		System.out.println("구매금액 : " + buyPrice);
		System.out.println("할인액 : " + disPrice);
		System.out.println("청구금액 : "+ (buyPrice - disPrice));
		
		sc.close();
	}
}

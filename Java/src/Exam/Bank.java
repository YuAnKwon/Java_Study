package Exam;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		int inputNum;

		do {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택 > ");
			inputNum = sc.nextInt();
			
			switch (inputNum) {
			case 1: {
				System.out.print("예금액 > ");
				money += sc.nextInt();
				break;
			}
			case 2: {
				System.out.print("출금액 > ");
				int input = sc.nextInt();
				if (input > money) {
					System.out.println("잔고부족");
					System.out.printf("부족금액 : %d원\n", input - money);
					break;
				}
				money -= input;
				break;
			}
			case 3: {
				System.out.printf("잔고 > %d\n", money);
				break;
			}
			case 4: {
				break;
			}
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		} while (inputNum != 4);
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}

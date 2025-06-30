package Exam;

import java.util.Scanner;

public class HappyThousand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		System.out.printf("현재 가진 돈은 %,d원 입니다.\n", money);
		
		while (money > 0) {
			System.out.printf("얼마를 사용하시겠습니까? --> ");
			int input = sc.nextInt();
			
			//현재 가진 돈보다 크거나 0 혹은 음수를 입력 시
			if (input > money || input <= 0) {
				System.out.printf("다시 입력해주세요, 사용 범위가 틀렸습니다.\n");
				continue;
			}else {
				money -= input;
				System.out.printf("현재 가진 돈은 %,d원 입니다.\n", money);				
			}
		}
		System.out.println("모든 돈을 사용하였습니다. . . 종료");
		sc.close();
	}
}

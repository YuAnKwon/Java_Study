package Exam;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"첫", "두", "세"};
		int[] diceArr = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print(str[i] + " 번째 주사위를 굴리겠습니까? --> ");
			sc.nextLine();
			diceArr[i] = (int) (Math.random() * 6) + 1;
			System.out.println(str[i] + " 번째 주사위 값 :" + diceArr[i]);
		}

		int[] count = new int[7];  // 1~6 사용
		for (int i = 0; i < diceArr.length; i++) {
			count[diceArr[i]]++;
		}

		int money = 0;

		// 1. 같은 눈
		for (int i = 1; i <= 6; i++) {
			if (count[i] == 3) {
				money = 10000 + i * 1000;
				break;
			} else if (count[i] == 2) {
				money = 1000 + i * 100;
				break;
			}
		}

		// 2. 모두 다른 눈
		if (money == 0) {
			int max = 0;
			for (int i = 0; i < diceArr.length; i++) {
				max = Math.max(max, diceArr[i]);
			}
			money = max * 100;
		}

		System.out.println("총 상금은 " + money + "원 입니다.");
		sc.close();
	}
}

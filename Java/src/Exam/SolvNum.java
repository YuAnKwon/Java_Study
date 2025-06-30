package Exam;

import java.util.Scanner;

public class SolvNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randNum = (int) (Math.random() * 100 + 1);
		String yesNo = "y";
		int count = 0; // 추측 횟수
		while (yesNo.equals("y")) {
			System.out.print("숫자를 입력하십시오 --> ");
			int input = sc.nextInt();
			if (randNum > input) {
				System.out.println("정답은 해당 숫자보다 큽니다.");
				count++;
			} else if(randNum < input){
				System.out.println("정답은 해당 숫자보다 작습니다.");
				count++;
				System.out.println(count);
			} else {
				count++;
				System.out.println("정답입니다!");
				System.out.printf("추측횟수는 %d입니다.\n",count);
				System.out.println("계속 하시겠습니까?(y/n)  -->");
				yesNo = sc.next();
				if(yesNo.equals("y")) {
					randNum = (int) (Math.random() * 100 + 1);
					count = 0;
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

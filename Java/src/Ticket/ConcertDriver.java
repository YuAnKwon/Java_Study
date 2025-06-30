package Ticket;

import java.util.Scanner;

public class ConcertDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Concert con = new Concert("가수왕", 100, 10000, 20000);
		System.out.println("콘서트 판매 프로그램을 시작합니다");

		char flag = 'S';
		while (true) {
			if (con.isValidOnline()) {
				System.out.print("인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: ");
			} else {
				System.out.print("현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");
			}

			// 판매 방법 입력.
			char inputFlag = sc.next().charAt(0);

			if (inputFlag == 'S') {
				System.out.printf("파는 티켓들 수는 ? <최대 %d> ", con.getRest());
				int ticketNum = sc.nextInt();
				con.purchase(ticketNum);
				
			} else if (inputFlag == 'V') {
				con.setValidOnline(false);
				System.out.printf("파는 티켓들 수는 ? <최대 %d> ", con.getRest());
				int ticketNum = sc.nextInt();
				con.purchase(ticketNum);
			} else if (inputFlag == 'F') {
				break;
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
			System.out.println("남은 티켓들의 수 : " + con.getRest());
		}
		con.report();
		System.out.println("계속하려면 아무 키나 누르십시오...");
		sc.next();
		sc.close();
	}
}

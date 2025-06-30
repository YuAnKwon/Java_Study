package Ticket;

import java.util.Scanner;

public class ConcertDriver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Concert concert = new Concert("가수왕", 100, 10000, 20000);
		System.out.println("콘서트 판매 프로그램을 시작합니다");

		boolean isF = false;

		while (!isF) {
			System.out.print("인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: ");
			String input = sc.next();

			if (input.equals("S")) {
				int canBuyTicket = concert.getCapa() - concert.getSoldNum(); // 구매가능한 티켓 수
				System.out.printf("파는 티켓들 수는 ? <최대 %d> : ", canBuyTicket);

				// 살 수 있으면
				int inputNum = sc.nextInt();
				if (inputNum <= canBuyTicket) {
					concert.setSoldNum(inputNum + concert.getSoldNum());
					concert.setTotalSales(inputNum * concert.getOnPrice());
					System.out.println("티켓들의 총 가격 = " + (inputNum * concert.getOnPrice()));
				} else {
					System.out.println("죄송합니다. 판매를 완료할 수 없습니다");
					System.out.println(canBuyTicket);
				}

				System.out.println("남은 티켓들의 수 : " + (concert.getCapa() - concert.getSoldNum()));
			} 
			
			else if (input.equals("V")) {
				concert.setValidOnline(false);
				System.out.println("현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");

			} 
			
			else {
				if (input.equals("F")) {
					isF = true;
				} else {
					System.out.println("잘못 선택하셨습니다.");
				}
			}
		}
		System.out.println("최종 판매 보고서 \n");
		System.out.println(concert.getSingerName() + "콘서트 티켓 판매 내역");
		System.out.printf("팔린 티켓 수 : %d, 총 판매 금액 %d \n", concert.getSoldNum(), concert.getTotalSales());
		System.out.println("계속하려면 아무 키나 누르십시오...");
		sc.close();
	}
}

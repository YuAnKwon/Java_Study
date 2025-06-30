package Ticket;

public class Concert {
	private String singerName;
	private int capa; // 수용 인원
	private int onPrice; // 인터넷 티켓 가격
	private int offPrice; // 현장 티켓 가격
	private int soldNum;// 팔린 티켓 수
	private int totalSales; // 총 판매 금액
	private boolean validOnline = true; // 티켓 인터넷 판매 가능 여부
	private int rest; // 남은 티켓

	public Concert(String singerName, int capa, int onPrice, int offPrice) {
		this.singerName = singerName;
		this.capa = capa;
		this.onPrice = onPrice;
		this.offPrice = offPrice;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public int getCapa() {
		return capa;
	}

	public void setCapa(int capa) {
		this.capa = capa;
	}

	public int getOnPrice() {
		return onPrice;
	}

	public void setOnPrice(int onPrice) {
		this.onPrice = onPrice;
	}

	public int getOffPrice() {
		return offPrice;
	}

	public void setOffPrice(int offPrice) {
		this.offPrice = offPrice;
	}

	public int getSoldNum() {
		return soldNum;
	}

	public void setSoldNum(int soldNum) {
		this.soldNum = soldNum;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}

	public boolean isValidOnline() {
		return validOnline;
	}

	public void setValidOnline(boolean validOnline) {
		this.validOnline = validOnline;
	}

	public int getRest() {
		rest = capa - soldNum;
		return rest;
	}

	public void setRest(int rest) {
		this.rest = rest;
	}

	public void purchase(int ticketNum) {
		if (ticketNum <= rest && ticketNum > 0) {
			int price = validOnline ? onPrice : offPrice;
			soldNum += ticketNum;
			totalSales += ticketNum * price;
			System.out.println("티켓들의 총 가격 : " + ticketNum * price);
		} else {
			System.out.println("죄송합니다. 판매를 완료할 수 없습니다");
		}
	}

	public void report() {
		System.out.println("\n최종 판매 보고서 \n");
		System.out.println(singerName + "콘서트 티켓 판매 내역");
		System.out.printf("팔린 티켓 수 : %d, 총 판매 금액 %d \n", soldNum, totalSales);
	}

	@Override
	public String toString() {
		return "Concert [singerName=" + singerName + ", capa=" + capa + ", onPrice=" + onPrice + ", offPrice="
				+ offPrice + ", soldNum=" + soldNum + ", totalSales=" + totalSales + ", validOnline=" + validOnline
				+ ", rest=" + rest + "]";
	}

}

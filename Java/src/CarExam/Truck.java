package CarExam;

public class Truck extends Vehicle{
	private double capa;

	public Truck(String model, int price, double capa) {
		super(model, price);
		this.capa = capa;
	}

	@Override
	String getInfo() {
		String info = "모델명: " + getModel() + ", 가격 : " + getPrice() + ", 적재 중량 : " + capa;
		return info;
	}

	@Override
	double calcTax() {
		if (this.capa >= 10000) {
			return super.getPrice() * 0.04;
		} else if (this.capa >= 5000) {
			return super.getPrice() * 0.02;
		} else {
			return super.getPrice() * 0.01;
		}
	}

}

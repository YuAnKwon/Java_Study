package CarExam;

public class Car extends Vehicle {
	private int cc;

	public Car(String model, int price, int cc) {
		super(model, price);
		this.cc = cc;
	}

	@Override
	String getInfo() {
		String info = "모델명: " + getModel() + ", 가격 : " + getPrice() + ", 배기량 : " + cc;
		return info;
	}

	@Override
	double calcTax() {
		if (this.cc >= 3000) {
			return super.getPrice() * 0.05;
		} else if (this.cc >= 1500) {
			return super.getPrice() * 0.03;
		} else {
			return super.getPrice() * 0.01;
		}
	}

}

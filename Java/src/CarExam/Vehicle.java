package CarExam;

abstract public class Vehicle {
	private String model;
	private int price;

	// 생성자
	public Vehicle(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	// Getter / Setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	abstract String getInfo();
	abstract double calcTax();

}

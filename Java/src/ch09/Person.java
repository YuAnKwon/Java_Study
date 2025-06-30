package ch09;

public class Person {
	private String name;
	private String birth;
	private int height;
	private double weight;

	
	
	public Person() {
	}

	public Person(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}

	public Person(String name, String birth, int height) {
		this.name = name;
		this.birth = birth;
		this.height = height;
	}
	
	public Person(String name, String birth, int height, double weight) {
		this.name = name;
		this.birth = birth;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		if (validateHeight(height)) {
			this.height = height;
		} else {
			System.out.println("입력한 값이 유효하지 않습니다.");
		}
	}

	private boolean validateHeight(int height) {
		// 조건 : 키는 음수가 될 수 없고, 5미터를 넘어갈 수 없다.
		if (height >= 0 && height < 500) {
			return true;
		} else {
			return false;
		}
	}

	public double getBMI() {
		return weight /  Math.pow((double)height/100, 2);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birth=" + birth + ", height=" + height + "]";
	}

	public void run() {
		System.out.println(this.name + " 뛴다.");
	}

	public void eat(String food) {
		System.out.println(this.name + "이가 " + food + " 먹는다.");
	}

}

package AnimalExam;

abstract public class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println(this.name + "이/가 쿨쿨.");
	}

	abstract public void cry();
}

package AnimalExam2;

public abstract class Animal {
	String name;

	// 추상클래스의 생성자 : 상속하는 자식 클래스들이 호출하기 위해.
	protected Animal(String name) {
		this.name = name;
	}

	public abstract void makeSound();

	public void breathe() {
		System.out.println(this.name + "가 숨쉬는중");
	}
}
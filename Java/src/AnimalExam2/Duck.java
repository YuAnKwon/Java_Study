package AnimalExam2;

public class Duck extends Animal implements Swimmable, Flyable {
	public Duck(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + "는 꽉꽉~~~");
	}

	@Override
	public void fly() {
		System.out.println(this.name + "이가 가까스로 하늘을 납니다.");
	}

	@Override
	public void swim() {
		System.out.println(this.name + "이가 물 위를 둥둥 떠나다닌다.");
	}
}

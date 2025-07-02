package AnimalExam2;

public class Fish extends Animal implements Swimmable {
	public Fish(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + "는 꿈뻑~~~");
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + "이가 물속을 빠르게 헤엄을 칩니다.");
	}
}

package AnimalExam2;

public class Bird extends Animal implements Flyable{
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println(this.name + "는 짹쨱~~~");
	}
	
	@Override
	public void fly() {
		System.out.println(this.name + "이가 하늘을 훨훨~~ 납니다.");
	}
}

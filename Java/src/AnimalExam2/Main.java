package AnimalExam2;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = {
				new Bird("참새"),
				new Fish("금붕어"),
				new Duck("꽉꽉이")
		};
		
		System.out.println("=====================");
		System.out.println("--- 클래스 다형성 체크 ---");
		System.out.println("=====================");
		for(int i=0; i<animals.length; i++) {
			animals[i].makeSound();
			animals[i].breathe();
			if(animals[i] instanceof Swimmable) {
				Swimmable s = (Swimmable)animals[i];
				s.swim();
			}
			if(animals[i] instanceof Flyable) {
				((Flyable)animals[i]).fly();
			}
		}

//		System.out.println("========================");
//		System.out.println("--- 인터페이스 다형성 체크 ---");
//		System.out.println("========================");
//		
//		Flyable[] flyingAnimals = {
//			new Bird("독수리"),
//			new Duck("오리오리")
//		};
//		
//		for(Flyable f : flyingAnimals) {
//			f.fly();
//		}
//		
//		System.out.println("========================");
//		Swimmable swimmer = (Swimmable)animals[1];
//		// 참조 타입이 Animal
//		// 메모리에 실재하는 인스턴스는 Fish => Animal(상속) + Swimmable(구현)
//		swimmer.swim();
//		
//		Duck duck = (Duck)animals[2];
//		// 참조 타입이 Animal
//		// 메모리에 실재하는 인스턴스는 Duck => Animal(상속) + Swimmable, Flyable(구현)
//		duck.swim();
//		duck.fly();
//		doSomething(duck);
//		Bird bird = (Bird)animals[0];
//		doSomething(bird);

	}
//	
//	static void doSomething(Duck duck) {
//		duck.makeSound();
//	}
//	static void doSomething(Fish fish) {
//		fish.makeSound();
//	}
//	static void doSomething(Bird bird) {
//		bird.makeSound();
//	}
}

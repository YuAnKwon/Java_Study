package AnimalExam;

public class Dog extends Animal {
	int age;
	
	Dog(String name, int age) {
		super(name); // 부모에 있으니까.
		this.age = age; // Dog 자식만 있으니까.
	}

	@Override
	public void cry() {
		System.out.println("멍멍");
	}
}

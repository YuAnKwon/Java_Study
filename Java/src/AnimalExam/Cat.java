package AnimalExam;

public class Cat extends Animal {
	// 기본 생성자는 부모 생성자까지 호출된다.
	public Cat(String name) {
		// super(); -->Animal의 기본 생성자 호출(오류)->(이미 Animal에 생성자를 만들어놔서 기본생성자가 안됨)
		super(name);
	}

	@Override
	public void cry() {
		System.out.println("야옹");
	}
}

package ch12;

// A,B,C 인터페이스의 구현체
public class AImpl implements ABC {

	@Override
	public void a() {
		System.out.println("인터페이스 A의 a() 메서드를 호출하였습니다.");

	}

	public void test() {
		System.out.println("클래스 A의 test() 메서드를 호출하였습니다.");
	}

	@Override
	public void b() {
		System.out.println("인터페이스 B의 b() 메서드를 호출하였습니다.");
	}

	@Override
	public void c() {
		System.out.println("인터페이스 C의 c() 메서드를 호출하였습니다.");
	}

}

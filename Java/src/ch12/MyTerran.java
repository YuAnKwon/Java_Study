package ch12;

abstract class Unit {
	// 인스턴스를 만들 수 없다.
	// 반드시 이 클래스를 상속하여 자식클래스로 사용해야한다.
	String name;
	int hp;
	// 유짓을 상속할 클래스들이 공통으로 갖는 속성

	// 유닛을 상속하는 클래스는 반드시 doMove라는 메서드를 갖는다.
	// 추상메서드의 구현은 자식 클래스의 몫이다.
	// 추상 클래스는 추상 메서드를 가질수도 있고 없을 수도 있다.
	abstract void doMove();
}

class Marine extends Unit {
	int attack;

	@Override
	void doMove() {
		System.out.println(attack + "공격");
	}
}

class Medic extends Unit {
	int heal;

	@Override
	void doMove() {
		System.out.println("이동속도 8으로 이동");
		System.out.println("치유");
	}
}

public class MyTerran {
	public static void main(String[] args) {
		Marine unit1 = new Marine();
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;

		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;

		unit1.doMove();
		System.out.println();
		unit2.doMove();
	}

}

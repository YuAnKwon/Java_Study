package ch22;

interface Unit5 {
	void move(String s);
}

public class Ex05_Lambda1 {
	public static void main(String[] args) {
		Unit5 unit = (String s) -> {
			System.out.println(s);
		};
		unit.move("named : Unit 5");
	}
}

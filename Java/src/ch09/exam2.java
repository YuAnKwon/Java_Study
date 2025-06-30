package ch09;

public class exam2 {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동","000123");
		Person person2 = new Person("김김김","891201",180);
		person2.setName("asdasd");
		person2.setHeight(160);
		
		Person person3 = new Person("피크민","333333",160,60);
		System.out.printf("%s의 BMI 수치는 %.2f입니다.\n",person3.getName(),person3.getBMI());
		
		
		//[이름]의 BMI 수치는 [~~]입니다.
		
//		if(person1.getHeight() > person2.getHeight()) {
//			System.out.println(person1.getName()+ "의 키가 더 큽니다.");
//		} else {
//			System.out.println(person2.getName() + "의 키가 더 큽니다.");
//		}
	}
}

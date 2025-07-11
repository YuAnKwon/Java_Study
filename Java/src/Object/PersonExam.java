package Object;

public class PersonExam {
	public static void main(String[] args) {
		Person person1 = Person.builder()
				.name("홍길동")
				.phoneNumber("010-2222-3333")
				.build();
		System.out.println(person1);
		
		Person2 person2 = new Person2("이순신", "010-2232-4455");
		System.out.println(person2);
	}
}

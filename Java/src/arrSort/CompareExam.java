package arrSort;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		Person[] people = {
				new Person("김", 23),
				new Person("Lee", 19),
				new Person("Park",30)
		};
		Arrays.sort(people, new PersonComparator());
		
		for(Person p : people) {
			System.out.println(p);
		}
	}
}

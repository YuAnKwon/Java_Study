package ch23;

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");
		
		// 사전순 정렬
		list.stream()
		.sorted()
		.forEach(n-> System.out.println(n));
		
		// 글자 길이 순 정렬
		list.stream()
		.sorted((s1, s2) -> s1.length() - s2.length())
		.forEach(n-> System.out.println(n));
	}
}

package ch21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam1 {
	public static void main(String[] args) {
		// 1. numbers라는 이름의 ArrayList 생성
		// 2. [5,3,8,2,7,6] 순서대로 값 추가
		// 3. evenNumbers 라는 이름의 다른 ARrayList 생성
		// 4. numbers의 값 중 짝수만 골라서 evenNumbers에 추가
		// 5. evenNumbers 정렬(sort)
		// 6. evenNumbers 값 전체 출력.	
		
		// 1.
		List<Integer> numbers = new ArrayList<>();
		
		// 2.
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(2);
		numbers.add(7);
		numbers.add(6);
		
		// 3. 
		List<Integer> evenNumbers = new ArrayList<>();
		
		// 4.
		for(int num : numbers) {
			if(num % 2 == 0) {
				evenNumbers.add(num);
			}
		}
		
		// 5.
		Collections.sort(evenNumbers);
		
		// 6. 
		for(int num : evenNumbers) {
			System.out.print(num + " ");
		}
		
		
	}
}

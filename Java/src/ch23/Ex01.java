package ch23;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		List<Integer>list = new ArrayList<Integer>();
		
		for (int i : arr) {
			if(i%2==1) {
				list.add(i);
			}
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			System.out.println(i);
		}
		
		Arrays.stream(arr)
		.filter(n -> n%2==1)
		.sorted()
		.forEach(n -> System.out.println(n));
	}
}

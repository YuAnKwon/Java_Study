package ch23;

import java.util.*;
import java.util.stream.Collectors;

public class Ex05_Map {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "orange");
		// List<String> -> String[]
		String[] strArr = list.stream().toArray(String[]::new);
		String[] str = new String[list.size()];
		for(int i=0; i<str.length; i++) {
			str[i] = list.get(i);
		}
		
		// String[] -> List<String>
		List<String> strList = Arrays.stream(strArr).collect(Collectors.toList());
		
		//int[] -> List<Integer>
		int[] intArr = {1,2,3,4,5};
		List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());
		
		//List<Integer> -> int[]
		int[] intArr2 = intList.stream()
				.mapToInt(i -> i.intValue())
				.toArray();
	}
}

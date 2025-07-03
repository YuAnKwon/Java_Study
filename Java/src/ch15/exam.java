package ch15;

import java.util.Arrays;

public class exam {
	public static void main(String[] args) {
		String str = "apple banana apple orange banana apple orange zzz";
		String[] arr = str.split(" ");
		Arrays.sort(arr);

		// apple apple apple banana banana orange
		int count = 1;
		for (int i=1; i <arr.length; i++) {
			if (arr[i].equals(arr[i-1])) {
				count++;
			} else {
				System.out.println(arr[i-1] + " : " + count);
				count = 1;
			}
		}
		System.out.println(arr[arr.length-1] + " : " + count);
	}
}

/*
 * str에 나열된 과일이 등장한 빈도를 과일 이름의 사전 순서대로 출력하는 프로그램을 작성하라.
 * 
 * apple : 3 banana : 2 orange : 1
 * 
 * Arrays.sort(arr); // 오름차순으로 정렬. String -> Char[] 배열로 변환 : str.toCharArray();
 */

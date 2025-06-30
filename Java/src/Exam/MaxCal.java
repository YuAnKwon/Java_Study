package Exam;

public class MaxCal {
	public static void main(String[] args) {
		int[] arr = {3,12,45,9,38,31,27,20,50};
		
//		int max = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}

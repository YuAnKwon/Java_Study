package ch21;

import java.util.Arrays;
import java.util.List;

public class Exam2 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, -2, 5, -1); 		
//		int max = 0; 
//		int sum = 0;
//		for(int i=0; i<nums.size(); i++){
//			sum = nums.get(i);
//			for(int j=i+1; j<nums.size(); j++) {	
//				sum += nums.get(j);
//				max = Math.max(max, sum);
//			}
//		}
//		System.out.println("최대 연속 부분합 : "+max);
        int maxSum = nums.get(0);         // 전체 중 최댓값
        int currentSum = nums.get(0);     // 현재 연속합

        for (int i = 1; i < nums.size(); i++) {
            int num = nums.get(i);
            currentSum = Math.max(num, currentSum + num);  // 현재 위치에서 누적할지, 새로 시작할지
            maxSum = Math.max(maxSum, currentSum);         // 지금까지 최대값 갱신
        }

	}
}

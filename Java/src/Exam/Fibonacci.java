package Exam;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 개의 피보나치수 출력 --> n = ");
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		if(n>=1) System.out.println(first);
		if(n>=2) System.out.println(second);
		
		for(int i=0; i<n-2; i++) {
			int num = first + second;
			first = second;
			second = num;
			System.out.printf(" %d", num);
		}
		sc.close();
	}

}

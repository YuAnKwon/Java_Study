package ch11;

import java.util.Random;

public class Ex02_Preload {
	static int num;
	
	// static 초기화 블록
	static {
		Random rand = new Random();
		// main() 실행 전에 이미 난숫값이 대입 됨.
		num = rand.nextInt(100);
	}
	public static void main(String[] args) {
		System.out.println(num);
	}
}

package ch03;

public class Ex02_TypeChange1 {
	public static void main(String[] args) {
		int num1 = 1;
		byte num2 = 1;
		byte num3 = 127;
		//byte num4 = 128;
		
		short num5 = 128;
		//num2 = num5;
		num2 = (byte)num5;
		System.out.println(num2);
		
		
	}
}

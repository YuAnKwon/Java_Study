package ch01;

public class ex02 {

	public static void main(String[] args) {
		double num1 = 1.0000001;
		System.out.println(num1);
		
		double num2 = 2.0000001;
		System.out.println(num2);
		
		double result = (num1*10000000 + num2*10000000)/10000000;
		System.out.println(result);
		
		
	}

}

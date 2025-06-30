package ch04;

public class Ex07_ShortCircuit {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean result;
		
		result = ((x=x+1)<0 && (y=y+1)>0);
		
		System.out.println("result = "+result);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		System.out.println();
		
		result = ((x=x+1)>0 || (y=y+1)<0);
		
		System.out.println("result = "+result);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
}

package ch15;

public class Ex01_ArrayInstance {
	public static void main(String[] args) {
		int[] ar1 = new int[5];
		
		double[] ar2 = new double[7];
		
		float[] ar3;
		ar3 = new float[9];
		
		BoxA1[] ar4 = new BoxA1[5];
		
		System.out.println("배열 ar 길이" + ar1.length);
		System.out.println("배열 ar 길이" + ar2.length);
		System.out.println("배열 ar 길이" + ar3.length);
		System.out.println("배열 ar 길이" + ar4.length);
	}
}

class BoxA1{
	
}
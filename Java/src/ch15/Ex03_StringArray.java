package ch15;

public class Ex03_StringArray {
	public static void main(String[] args) {
		String[] name = new String[7];

		name[0] = new String("홍길동");
		name[1] = new String("12");
		name[2] = new String("홍2");
		name[3] = new String("홍3");
		name[4] = new String("홍4");
		name[5] = new String("홍5");
		name[6] = new String("홍6");

		int cnum = 0;

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			cnum += name[i].length();
		}
		System.out.println("총 문자의 수 : " + cnum);
	}
}

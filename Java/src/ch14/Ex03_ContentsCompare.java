package ch14;

public class Ex03_ContentsCompare {
	public static void main(String[] args) {
		String str1 = new String("Apple");
		String str2 = new String("apple");
		String str3 = new String("Banana");
		int cmp;

		// 인스턴스 내용 비교
		if (str1.equals(str3)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		cmp = str1.compareTo(str2);

		if (cmp == 0) {
			System.out.println("두 문자열은 일치합니다.");
		} else if (cmp < 0) {
			System.out.println("사전의 앞에 위치하는 문자 : " + str1);
		} else {
			System.out.println("사전의 앞에 위치하는 문자 : " + str2);
		}

		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
	}
}

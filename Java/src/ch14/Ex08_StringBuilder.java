package ch14;

public class Ex08_StringBuilder {
	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder("동해물과");
		
		buf.append("백두산이");
		System.out.println(buf);
		
		buf.append(12345);
		System.out.println(buf);
		
		buf.delete(0, 4);
		System.out.println(buf);
		
		buf.replace(4,8,"ABC");
		System.out.println(buf);
		
		buf.reverse();
		System.out.println(buf);
		
	}
}

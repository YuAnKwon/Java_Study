package ch12;

public class Main {

	public static void main(String[] args) {
		ABC a = new AImpl();
		a.a();
		a.test();
		a.b();
		a.c();
		System.out.println(A.b);
	}
}

package Study;
import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc();//추상 매소드
	protected void input() {//두 정수를 입력받는 메소드
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 2개를 입력하시오>>");
		a=scanner.nextInt();
		b=scanner.nextInt();
	}
	public void run() {//두 정수를 입력받아 계산하고 결과를 출력하는 메소드
		input();
		int res=calc();
		System.out.println("계산된 값은 "+res);
	}
}
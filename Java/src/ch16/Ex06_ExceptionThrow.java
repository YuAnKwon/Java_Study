package ch16;

public class Ex06_ExceptionThrow
{
    public static void myMethod1(int n)
    {
    	try {
    		myMethod2(n, 0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
    }
    public static void myMethod2(int n1, int n2)
    		throws ArithmeticException,
    		ClassNotFoundException,
    		IllegalArgumentException
    {
    		if(n2 == 0) {
    			throw new IllegalArgumentException("매개변수가 부적절하다");
    		}
			Class.forName("Ex06_Exceptow");
    		int r = n1 / n2;    // 예외 발생 지점
    }
    public static void main(String[] args)
    {
        myMethod1(3);
        System.out.println("Exception Throw !!!");
    }
}
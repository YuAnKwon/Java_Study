package ch25;

class MyThread2 extends Thread 
{
	@Override
	// 스레드에 이미 정의되어있는 메서드. 
    public void run() 
    {
        int sum = 0;
        for (int i=0; i<10; i++)
            sum = sum + i;
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + sum);    
    }
}

public class Ex02_ThreadClass
{
    public static void main(String[] args)
    {
        MyThread2 t = new MyThread2();
        MyThread2 t2 = new MyThread2();
        t.start();
        t2.start();
        System.out.println("main: " + Thread.currentThread().getName());
    }
}
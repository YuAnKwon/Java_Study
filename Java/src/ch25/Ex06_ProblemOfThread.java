package ch25;

public class Ex06_ProblemOfThread
{
    public static int money = 0;

    public static void main(String[] args) throws InterruptedException
    {
        Runnable task1 = () -> {
            for(int i = 0; i<10000; i++) {
                money++;
            }
            
        };

        Runnable task2 = () -> {
            for(int i = 0; i<10000; i++) {
                money--;
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
    
        t1.join();    // t1이 참조하는 스레드의 종료를 기다림
        t2.join();    // t2이 참조하는 스레드의 종료를 기다림
        // 메인스레드가 t1과 t2 스레드가 종료될때까지 기다리게 해야 money 를 출력하게 할 수 있음.
     
        // 스레드가 종료되면 출력을 진행함. 위 join의 영향
        System.out.println(money);
    }

}

package ch25;

public class Ex04_RunnableInterface2
{
    public static void main(String[] args)
    {
        Runnable task = () -> {
            try 
            {
                Thread.sleep(3000); 
                //시작하자마자 3초 잔다. 그리고 바로 실행은 아니고 코어 대기열에 들어간다.
                
            }
            catch (Exception e) { }

            int sum = 0;
            for (int i=0; i<10; i++)
                sum = sum + i;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + sum);
        };

        Thread t = new Thread(task); 
        t.start();

        System.out.println("main: " + Thread.currentThread().getName());
    }
}

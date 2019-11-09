
import java.util.*;
class MyThread implements Runnable
{
    private int threadId;
    private int delay;
    MyThread(int id,int d)
    {
      threadId = id;
      delay = d;//time for which thread sleeps
    }

     public void run()
     {
         for(int i=0;i<4;i++)
         {
            System.out.println("Thread "+ threadId +" is running");
            try
            {
               Thread.sleep(delay);
            }
            catch(InterruptedException e)
            {
               e.printStackTrace();
            }
        }
        System.out.println("Thread "+ threadId +" is Finished");
     }
}
public class Child_b 
{
    public static void main(String ts7[])
    {
        System.out.println("Main thread starts");
        MyThread r1 = new MyThread(2,400);
        Thread t1 = new Thread(r1);
        t1.start();
        System.out.println("Main thread is finished");
    }
} 

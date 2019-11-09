import java.util.*;
class Callme
{
    synchronized void call(String msg)
    {
       System.out.print("["+msg);
    try
    { Thread.sleep(1000);}
    catch(InterruptedException tan)
    { System.out.println("Interrupted");    }
    System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    Thread t;
    Callme target;
    Caller(String m,Callme tan)
    {
        target=tan;
        msg=m;
        t=new Thread(this);
        t.start();
    }
    public void  run()
    {
       target.call(msg);
    }
}
public class Synchonise
{
    public static void main(String ts7[])
    {
        Callme ob=new Callme();
        Caller t1=new Caller("Hello",ob);
        Caller t2=new Caller("CSE",ob);
        t2.t.setPriority(10);
        Caller t3=new Caller("Students",ob);
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch(InterruptedException tan)
        { System.out.println("Interrupted");    }
    }
}


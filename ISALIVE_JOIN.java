import java.util.*;
class Callme
{
	synchronized void call(String msg)
	{
	   System.out.print("["+msg);
	try
	{ Thread.sleep(1000);}
	catch(InterruptedException tan)
	{ System.out.println("Interrupted");	}
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
	public void run()
	{
	   target.call(msg);
	}
}
public class ISALIVE_JOIN{
 public static void main(String ts7[])
 {
    Callme ob=new Callme();
    Caller t1=new Caller("Hello",ob);
    System.out.println("\nIs alive t1?"+t1.t.isAlive());
    Caller t2=new Caller("CSE",ob);
    t2.t.setPriority(10);
    System.out.println("\nIs alive t2?"+t2.t.isAlive());
    Caller t3=new Caller("Students",ob);
    System.out.println("\nIs alive t3?"+t3.t.isAlive());
    try
	{
	    t1.t.join();
	    t2.t.join();
	    t3.t.join();
	}
	catch(InterruptedException tan)
	{ System.out.println("Interrupted");	}
}
}


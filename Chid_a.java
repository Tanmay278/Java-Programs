import java.util.*;
class Chid_a extends Thread
{
	public static void main(String ts7[])
	{
		Thread t = new Thread();
		System.out.println("Current Thread : "+ t);
		System.out.println("Within Main thread"); 
		ChildThread ct = new ChildThread(); 
		System.out.println("Child Thread : "+ ct);
		
	}
}

class ChildThread extends Thread
{
    	ChildThread()
    	{
    	    super("Thread khulchi:::");
    	    System.out.println(Thread.currentThread());
    	    start();
    	   }
} 

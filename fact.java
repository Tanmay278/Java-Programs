import java.io.*;
class fact
{
	public static void main(String args[])
	{
		int n,f=1;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
			f*=i;
		System.out.println("Factorial of "+n+" is:"+f);
	}
}
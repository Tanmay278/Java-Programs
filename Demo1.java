package demo_pack;
import java.util.*;
public class Demo1
{
public static void main(String ts7[])
{
	Demo1 ob=new Demo1();
             ob.show();
	System.out.println("Exception ts7 to be handled ");
}
  
 public void show()
 {
   Scanner sc=new Scanner(System.in);
   int n1,n2;
   System.out.println("Enter 2 nos.:");
   n1=sc.nextInt(); n2=sc.nextInt();
   System.out.print("Sum of two nos.:");
   sum(n1,n2);
 }
 public void sum(int n1,int n2)
 {
   System.out.println(n1*n2);
}

}


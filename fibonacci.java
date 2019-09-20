import java.util.*;
class fibonacci
{
   public static void main(String args[])
   {

   int n,a=0,b=1,c,n1=3;
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter no of terms:");
   n=sc.nextInt();
   System.out.println("Fibonacci Series:");
   System.out.print(a+"\t"+b+"\t");
   do
   {
      c=a+b;
      System.out.print(c+"\t");
      a=b;
      b=c;
      n1++;   }
      while(n1<=n);
   }
}
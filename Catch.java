import java.util.*;
class Catch
{
    public static void main(String ts7[])
    {
        Scanner sc=new Scanner(System.in);
        int x=0,n; double y;
        System.out.println("Enter n:");
        n=sc.nextInt();
        try
        {
        y=n/x;
    }
    catch(ArithmeticException t)
    { t.printStackTrace(); y=0; System.out.println("Kaaj korbe na");}
        System.out.print("Result is:"+y);
}
}
        
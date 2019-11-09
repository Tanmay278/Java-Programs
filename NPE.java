import java.util.*;
public class NPE
{
    public static void main(String ts7[])
    {
        Scanner sc=new Scanner(System.in);
        String tan=null;
        try
        {
            if(tan.equals("Name:")) System.out.println("Same");
        }
        catch(NullPointerException ts)
        {
            System.out.println("Exception Caught");
        }
        finally
        {
            System.out.println("Program Completed");
        }
    }
}

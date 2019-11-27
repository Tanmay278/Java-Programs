//TANMAY-16500117016
import java.util.*;
public class NPE
{
    static void main(String ts7[])
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
        finally//TANMAY
        {
            System.out.println("Program Completed");
        }
    }
}

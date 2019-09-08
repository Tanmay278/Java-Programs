import java.util.*;
class Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int f=0;
        String str,t="",text;
        char p;
        System.out.println("Enter a String:");
        str=sc.nextLine();
        str=str+"";
        int l=str.length();
        System.out.println("Frequency of the word to be searched:"); text=sc.next();
        for(int i=0;i<l;i++)
        {
            p=str.charAt(i);
            if(p!=' ') t+=p;
            else
            {
                if(t.compareTo(text)==0)
                f++;
                t="";
            }
        }
        System.out.println("The frequency of "+text+" is:"+f);
    }
}
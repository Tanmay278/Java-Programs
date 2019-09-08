import java.util.Scanner;
class ShortName
{
    static void main()
    {
    Scanner sc=new Scanner(System.in);
    int x,i,d=0;
    String st,st1="";
    char b=' ';
    System.out.println("Enter your string:");
    st=sc.nextLine();
    x=st.length();
    st1=st1+st.charAt(0);
    for(i=0;i<x;i++)
    {
        b=st.charAt(i);
        if(b==' ')
        {
            d++;
            if(d==1) st1+="."+(st.charAt(i+1));
            else if(d==2) st1+="."+(st.substring(i,x));
        }
    }
    System.out.println("Short Name is:"+st1);
}
}

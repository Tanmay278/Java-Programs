import java.util.Scanner;
class reverse
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int x,z;
        String st1,st2="",st3="";
        char b=0;
        System.out.println("Enter the line which required to get reversed:");
        st1=sc.nextLine();
        st1+=" ";
        x=st1.length();
        for(int i=0;i<x;i++)
        {
            b=(st1.charAt(i));
            if(b==' ')
            {
                st2=st3+" "+st2;
                st3="";}
            else st3+=b;
            }
            System.out.println("Reverse String:"+st2);
        }
    }
    

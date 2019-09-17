import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x,z;
        String st1,st2="";
        char b;
        System.out.println("Enter the line which required to get reversed:");
        st1=sc.nextLine();
        x=st1.length();
        for(int i=x-1;i>=0;i--)
        {
            b=(st1.charAt(i));
            st2=st2+b;
            }
            System.out.println("Reverse String:"+st2);
        }
    }
    

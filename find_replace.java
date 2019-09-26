import java.util.*;
class find_replace
{
public static void main(String ts7[])
{
String str,find,rep;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a line:");
str=sc.nextLine(); 
System.out.println("Enter a word:");
find=sc.nextLine();
boolean f=str.contains(find);
if(f==false) System.out.println("Word ts cannot be found in the line");
else
{
System.out.println("Enter a word to replace:");
rep=sc.nextLine();
System.out.println("Replaced String(TA):"+str.replaceAll(find,rep));
}

}
}

import java.util.Scanner;
class StrToken
{
public static void main(String ts7[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String : ");
String st1 = sc.nextLine();
int i,sum = 0
int len = st1.length();
for(int i=0;i<l;i++){
if(st1.charAt(0)==',')
continue;
char b = st1.charAt(i);
if(b==','){
sum += Character.getNumericValue(st1.charAt(i-1));
System.out.println("Number is :" + Character.getNumericValue(st1.charAt(i-1)));
}
}
sum += Character.getNumericValue(st1.charAt(i-1));
System.out.println("Number is :" + Character.getNumericValue(st1.charAt(i-1)));
System.out.println("The sum is : "+sum);
}
}

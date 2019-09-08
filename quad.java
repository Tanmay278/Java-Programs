import java.util.*;
class quad
{
    static void main()
    {
        double a,b,c,r1,r2,real,imag,det=0.0;
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER the co efficients:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        det=b*b-4*a*c;
        if(det>0||(det==0))
        {
            r1=(-b+Math.sqrt(det))/(2*a);
            r2=(-b-Math.sqrt(det))/(2*a);
            System.out.println("Root1:"+r1+" and Root2:"+r2);
        }
          else
          {
              real=-b/(2*a);
              imag=Math.sqrt(-det)/(2*a);
              if(imag>0)
              System.out.println("Root1:"+real+"+"+imag+"i and Root2:"+real+" "+-1*imag+"i");
              else
              System.out.println("Root1:"+real+"+"+-1*imag+"i and Root2:"+real+""+imag+"i");
            }}}
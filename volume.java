import java.util.*;
class volume
{
    double v=0,p=3.14;
    void calvol(float h,float r)
    {
        v=(p*r*r*h)/3;
        System.out.println("Volume of cone:"+v);
    }
    void calvol(float r)
    {
        v=(4*p*r*r*r)/3;
        System.out.println("Volume of sphere:"+v);
    }
    void calvol(float l,float b,float h)
    {
        v=l*b*h;
        System.out.println("Volume of cuboid:"+v);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        volume v=new volume();
        int ch; float r,l,b,h;
        ch=args.length;
            switch(ch)
            {
                case 1: 
	   r=Float.parseFloat(args[0]);
                v.calvol(r); break;
                case 3:
	   l=Float.parseFloat(args[0]);
	   b=Float.parseFloat(args[1]);
                h=Float.parseFloat(args[2]); 
                v.calvol(l,b,h); break;
                case 2:
	   h=Float.parseFloat(args[0]);
	   r=Float.parseFloat(args[1]);
                v.calvol(h,r); break;
                case 4: System.exit(0);
                default: System.out.println("No input given!");
            }
        
    }
}
        

import java.util.*;
class volume
{
    double v=0,p=3.14;
    void calvol(int s)
    {
        v=s*s*s;
        System.out.println("Volume of cube:"+v);
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
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        volume v=new volume();
        int s,ch; float r,l,b,h;
        int n=1;
        while(n==1)
        {
            System.out.println("Enter:\n1.Volume of Sphere\n2.Volume of Cuboid\n3.Volume of Cube\n4.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: 
                System.out.println("Enter the radius of sphere:"); r=sc.nextFloat();
                v.calvol(r); break;
                case 2:
                System.out.println("Enter the length,breadth and height of the cuboid:");
                l=sc.nextFloat();
                b=sc.nextFloat();
                h=sc.nextFloat();
                v.calvol(l,b,h); break;
                case 3:
                System.out.println("Enter side of the cube:");
                s=sc.nextInt();
                v.calvol(s); break;
                case 4: System.exit(0);
                default: System.out.println("Wrong choice!");
            }
        }
    }
}
        
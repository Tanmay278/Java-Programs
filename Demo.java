import java.util.*;
class Demo
{
    public static void main(String ts7[])
    {
        int ch;
        Rectangle ob1=new Rectangle();
        Square ob2=new Square();
        Circle ob3=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:\n1.Rectangle\n2.Square\n3.Circle\nEnter your Choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: ob1.printArea(); break;
            case 2: ob2.printArea(); break;
            case 3: ob3.printArea(); break;
            default: System.out.println("Wrong Choice!");
        }
    }
}

abstract class Shape
{
    int i1,i2;
    abstract void printArea();
}
class Rectangle extends Shape
{
    Scanner sc=new Scanner(System.in);
    int area=0;
    
    void printArea()
    {
        System.out.println("Enter length of the Rectangle:");
        i1=sc.nextInt();
        System.out.println("Enter breadth of the Rectangle:");
        i2=sc.nextInt();
            area=i1*i2;
        System.out.println("Area of the rectangle:"+area);}
}
class Square extends Shape
{
    Scanner sc=new Scanner(System.in);
    int area=0;
    
    void printArea()
    {
        System.out.println("Enter side of the Square:");
        i1=sc.nextInt();
        area=i1*i1;
        System.out.println("Area of the Square:"+area);
    }
}
class Circle extends Shape
{
    Scanner sc=new Scanner(System.in);
    double area=0;
    
    void printArea()
    {
        System.out.println("Enter radius of the Circle:");
        i1=sc.nextInt();
        area=(22*i1*i1)/7;
        System.out.println("Area of the Circle:"+area);
    }
}
        
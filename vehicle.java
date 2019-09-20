import java.util.*;
class Vehicle
{
 int wheels;
 double speed;
 
}
class Car extends Vehicle
{
 int pass;
 void input()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the car's details:\nNo. of wheels:");
   wheels=sc.nextInt();
   System.out.println("Speed of Car(Km/hr):");
   speed=sc.nextDouble();
   System.out.println("No. of passengers:");
   pass=sc.nextInt();
}
void display()
{
 System.out.println("No. of wheels:"+wheels+"\nSpeed:"+speed+"km/hr\nNo. of passengers:"+pass);
}
}

class Truck extends Vehicle
{
 double limit;
 void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Truck's details:\nNo. of wheels:");
    wheels=sc.nextInt();
    System.out.println("Speed of Truck(Km/hr):");
    speed=sc.nextDouble();
    System.out.println("Load limit:");
    limit=sc.nextDouble();
}
 void display()
  {
     System.out.println("No. of wheels:"+wheels+"\nSpeed:"+speed+"km/hr\nLoad limit:"+limit);}
 
}

class test
{
public static void main(String ts7[])
{

Car ob1= new Car();
Truck ob2=new Truck();
ob1.input();
ob2.input();
if(ob1.speed>ob2.speed)
System.out.println("Car is faster");
else
System.out.println("Truck is faster");
ob1.display();
ob2.display();
}
}


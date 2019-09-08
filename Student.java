import java.util.*;
class Student
{
    int n; String name;
    double tot=0; double avg=0.0;
    int marks[]=new int[10];
    void assign()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name=sc.nextLine();
        System.out.println("Enter the no. of subjects:");
        n=sc.nextInt();
        System.out.println("Enter their marks:(Out of 100)");
        for(int i=0;i<n;i++)
        marks[i]=sc.nextInt();
    }
    void compute()
    {
        for(int i=0;i<n;i++)
              tot=tot+marks[i];
              avg=tot/n;
            }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Total:"+tot);
        System.out.println("Average:"+avg);
    }
    static void main()
    {
        Student ob= new Student();
        ob.assign();
        ob.compute();
        ob.display();
    }
}
            
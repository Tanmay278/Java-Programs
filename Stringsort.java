import java.util.Scanner;
class Stringsort
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        String t;
        System.out.println("Enter number of names:");
        n=sc.nextInt();
        String m[]=new String[n];
        System.out.println("Enter names:");
        for(i=0;i<n;i++)
              m[i]=sc.next();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(m[i].compareTo(m[j])>0)
                {
                    t=m[i]; m[i]=m[j];
                    m[j]=t;
                }
            }
        }
        System.out.println("Sorted names:");
        for(i=0;i<n;i++) System.out.println(m[i]);
    }
}
            
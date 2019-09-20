import java.util.Scanner;
class sort
{
	public static void main(String args[])
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of terms:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++) System.out.println(a[i]);

	}

}
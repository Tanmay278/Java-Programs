import java.util.*;
class Non_Prime
{
	boolean isPrime(int num){
		boolean flag = false;
		for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(flag)
        	return true;
        else
        	return false;
	}
    public static void main()
    {
		Scanner sc = new Scanner(System.in);
		Non_Prime np=new Non_Prime();
		int n = sc.nextInt();
		int i=2;
		while (n!=0){
			i++;
			if (np.isPrime(i))
			{
				System.out.print(i+"  ");
				n--;
			}
		}
	}
	}
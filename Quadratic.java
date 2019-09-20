import java.util.*;
class quadratic 
{   
    public static void main(String[] args)
     {
        double a,b,c;
        System.out.println("Enter the co-efficients of  an quadratic equation:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if(determinant > 0)
         {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("root1 ="+root1+" and root2 = "+root2);
        }
        
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("root1=root2="+root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("root1 ="+realPart+"+"+imaginaryPart+"i"+" and root2 = "+realPart+"-"+imaginaryPart+"i");
        }
    }
}
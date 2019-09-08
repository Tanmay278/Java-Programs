import java.util.Scanner;
class BankAccount
{
    String name,id,type; double amount;
            double depo,wd;
    Scanner sc=new Scanner(System.in);
    void initialise()
    {
        System.out.println("Enter the name of the account holder:");
        name=sc.next();
        System.out.println("Enter his account id:");
        id=sc.next();
        System.out.println("Enter his type:");
        type=sc.next();
        System.out.println("Enter his account:");
        amount=sc.nextDouble();
    }
    void deposit()
    {
        System.out.println("Enter the amount to be depositted:");
        depo=sc.nextDouble();
        this.amount+=depo;
        System.out.println("Depositted amount:"+depo);
        
    }
    void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn:");
        wd=sc.nextDouble();
        if(this.amount-wd<1000)
        System.out.println("Amount cannot be withdrawn");
        else
        {
        this.amount-=wd;
        System.out.println("Withdrawn amount:"+wd);
    }
       
   }
   void display()
   {
       System.out.println("Amount currently in the account:Rs"+this.amount);
    }
    static void main()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        BankAccount ob= new BankAccount();
        System.out.println("Enter 1 to initialise\nEnter 2 to deposit an amount\nEnter 3 to withdrawn\nEnter 4 to be displayed\nEnter 5 to exit\n");
        n=sc.nextInt();
          
        switch(n)
        {
            case 1:  ob.initialise();  break;
            case 2:  ob.deposit(); break;
            case 3:  ob.withdraw(); break;
            case 4:  ob.display(); break;
            case 5:  break;
            default: System.out.println("Wrong Choice");
        }
}
}
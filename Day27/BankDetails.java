import java.util.*;
class Bank 
{
    String bankName;
    int accNo;
    String accType;
    float balance;
    Bank()
    {
        bankName="SBI";
        accNo=161;
        accType="saving";
        balance=1000;
    }
    void createAccount(String name,int no,String type,float b)
    {
        bankName=name;
        accNo=no;
        accType=type;
        balance=b;
    }
    void deposite(int amount)
    {
        balance+=amount;
    }
    void withdraw(int amount)
    {
        if(amount>balance)
        {
            System.out.println("account does not have"+amount);
            return;
        }
        balance-=amount;
    }
    void display()
    {
        System.out.println("bankname is"+bankName);
        System.out.println("account number is"+accNo);
        System.out.println("account type is"+accType);
        System.out.println("Available balance is"+balance);
    }
}
public class BankDetails 
{
    public static void main(String args[])
    {
        Bank bank=new Bank();
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("1.createaccount\n2.display\n3.deposite\n4.withdraw\n5.exit");
        System.out.println("Enter your choice");
        num=sc.nextInt();
        while(num!=5)
        {
            if(num==1)
            {
                bank.createAccount("RBI", 151, "current", 1000000);
            }
            else if(num==2)
            {
                bank.display();
            }
            else if(num==3)
            {
                bank.deposite(100);
            }
            else 
            {
                bank.withdraw(100);
            }
            num=sc.nextInt();
        }
    }    
}

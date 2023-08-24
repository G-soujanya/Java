class Account 
{
    int accountNo;
    String accountType;
    int accountBalance;
    public void setAccountDetails(int n,String t,int b)
    {
        accountNo=n;
        accountType=t;
        accountBalance=b;
    }
    public void withdraw(int withdraw)
    {
        accountBalance=accountBalance-withdraw;
    }
    public void deposite(int deposit)
    {
        accountBalance=accountBalance+deposit;
    }
    public void display()
    {
        System.out.println("account no"+accountNo);
        System.out.println("account type"+accountType);
        System.out.println("account balance"+accountBalance);
    }
}
class account 
{
    public static void main(String args[])
    {
        Account a=new Account();
        a.setAccountDetails(161,"single", 1000);
        a.withdraw(100);
        a.display();
        a.deposite(110);
        a.display();
    }    
}

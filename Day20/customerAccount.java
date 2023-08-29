class Customer 
{
    int custId;
    String custName;
    String custAddress;
    public Customer(int i,String n,String a)
    {
        custId=i;
        custName=n;
        custAddress=a;
    }
    public void display()
    {
        System.out.println("customer id is"+custId);
        System.out.println("customer name"+custName);
        System.out.println("customer address"+custAddress);
    }
}
class Account 
{
    int accId;
    String accType;
    Customer c;
    int accountBalance;
    public Account(int i,String t,Customer c1,int b)
    {
        accId=i;
        accType=t;
        c=c1;
        accountBalance=b;
    }
    public void display()
    {
        System.out.println("account id"+accId);
        System.out.println("accounttype"+accType);
        System.out.println("account balance"+accountBalance);
        c.display();
    }
}
class customerAccount 
{
    public static void main(String args[])
    {
        Customer c1=new Customer(160,"soujanya","kgp");
        Customer c2=new Customer(161,"suguna","atp");
        Account a1=new Account(130,"single",c1,100);
        Account a2=new Account(131,"double",c2,101);
        a1.display();
        a2.display();
    }    
}

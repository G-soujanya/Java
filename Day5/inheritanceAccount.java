import java.lang.*;
class Account 
{
    private String accno;
    private String name;
    private String address;
    private long phno;
    private String dob;
    private int balance;
    public String getAccno()
    {
        return accno;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public long getPhono()
    {
        return phno;
    }
    public String getdob()
    {
        return dob;
    }
    public int getBalance()
    {
        return balance;
    }
    public void setAddress(String a)
    {
        address=a;
    }
    public void setPhone(long p)
    {
        phno=p;
    }
    public void setBalance(int a)
    {
        balance=a;
    }
    /*public Account(String a,String n,String ad,long p,String dobb)
    {
        accno=a;
        name=n;
        address=ad;
        phno=p;
        dob=dobb;
    }*/
    public void close()
    {
        accno=null;
        name=null;
        address=null;
        phno=0;
        dob=null;
    }
}
class savingAccount extends Account
{
    public void deposite(int amount)
    {
        int x=getBalance()+amount;
        setBalance(x);
    }
    public void withdraw(int amount)
    {
        int x=getBalance()-amount;
        setBalance(x);
    }
}
class inheritanceAccount 
{
    public static void main(String args[])
    {
        savingAccount s=new savingAccount();
        s.setBalance(100);
        s.setAddress("anantapur");
        s.setPhone(9866144238l);
        s.deposite(50);
        s.withdraw(15);
        System.out.println(s.getBalance());
    }    
}

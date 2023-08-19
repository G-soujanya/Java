import java.lang.*;
class atm 
{
    synchronized public void checkbalance(String name)
    {
        System.out.println(name+"checking");
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("balance");
    }
    synchronized public void withdraw(String name,int amount)
    {
        System.out.println(name+"withdrawing");
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(amount);
    }
}
class customer extends Thread 
{
    String name;
    int amount;
    atm a;
    customer(String n,atm b,int am)
    {
        name=n;
        a=b;
        amount=am;
    }
    public void useAtm()
    {
        a.checkbalance(name);
        a.withdraw(name, amount);
    }
    public void run()
    {
        useAtm();
    }
}
class atmMachine 
{
    public static void main(String args[])
    {
        atm h=new atm();
        customer c1=new customer("smith",h,100);
        customer c2=new customer("john",h,200);
        c1.start();
        c2.start();
    }    
}

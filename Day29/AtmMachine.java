public class AtmMachine {
    synchronized public void checkBalance(String name)
    {
        System.out.println(name+" checking");
        try{
            Thread.sleep(100);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(name+" balance");
    }
    synchronized public void withdraw(String name)
    {
        System.out.println(name+" withdrawing");
        try{
            Thread.sleep(100);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(name+" withdrawn");
    }
}
class Customer extends Thread{
    String name;
    int id;
    Customer(String name,int id)
    {
        this.name=name;
        this.id=id;

    }
    public void useAtm()
    {
        AtmMachine a=new AtmMachine();
        a.checkBalance(name);
        a.withdraw(name);
    }
    public void run(){
        useAtm();
    }
}

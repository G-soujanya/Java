import java.lang.*;
class Mythread extends Thread 
{
    public  Mythread(String name)
    {
        super(name);
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ +"my thread");
        }
    }
}
class method2 
{
    public static void main(String args[]) throws Exception
    {
        Mythread t=new Mythread("my thread");
       
        t.start();
        int count=1;
        while(true)
        {
            System.out.println(count++ +"main");
            Thread.yield();
        }
        /*try{
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
    }    
}

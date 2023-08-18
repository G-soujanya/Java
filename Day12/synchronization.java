import java.lang.*;
class mydata
{
    void display(String a)
    {
        synchronized( this){
        for(int i=0;i<a.length();i++)
        {
            System.out.println(a.charAt(i));
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }}
    }
}
class mythread1 extends Thread 
{
    mydata d;
    mythread1(mydata s)
    {
        d=s;
    }
    public void run()
    {
        d.display("hello world");
    }
}
class mythread2 extends Thread 
{
    mydata d;
    mythread2(mydata s)
    {
        d=s;
    }
    public void run()
    {
        d.display("welcome");
    }
}
class synchronization
{
    public static void main(String args[])
    {
        mydata df=new mydata();
        mythread1 m=new mythread1(df);
        mythread2 m1=new mythread2(df);
        m.start();
        m1.start();
    }
}

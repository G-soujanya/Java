import java.lang.*;
class MyData 
{
    int value;
    boolean flag=true;
    synchronized public void set(int v)
    {
        while(flag!=true)
        {
            try{wait();}catch(Exception e){}
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
        {
            try{wait();}catch(Exception e){}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class producer extends Thread
{
    MyData data;
    public producer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}
class consumer extends Thread 
{
    MyData d;
    public consumer(MyData da)
    {
        d=da;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=d.get();
            System.out.println("Consumer "+value);
        }
    }
}
class interProcess 
{
    public static void main(String args[])
    {
        MyData dg=new MyData();
        producer p=new producer(dg);
        consumer c=new consumer(dg);
        p.start();
        c.start();
    }
}

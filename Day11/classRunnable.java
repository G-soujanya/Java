import java.lang.*;
class test implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
}
class classRunnable 
{
    public static void main(String args[])
    {
        test t=new test();
        Thread m=new Thread(t);
        m.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++;
        }
    }    
}

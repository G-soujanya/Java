import java.lang.*;
class runnableThread implements Runnable
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
    public static void main(String args[])
    {
        runnableThread m=new runnableThread();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++;
        }
    }    
}

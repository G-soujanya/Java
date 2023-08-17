import java.lang.*;

class threadTest extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"heloo");
            i++;
        }
    }
    public static void main(String args[])
    {
        
        threadTest t=new threadTest();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++;
        }
    }
}
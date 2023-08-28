import java.io.*;
class producer extends Thread 
{
    OutputStream os;
    public producer(OutputStream o)
    {
        os=o;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            try{
                os.write(count);
                os.flush();
                System.out.println("producer"+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }
            catch(Exception e){};
        }
    }
}
class Consumer extends Thread 
{
    InputStream is;
    public Consumer(InputStream i)
    {
        is=i;
    }
    public void run()
    {
        int x;
        while(true)
        {
            try{
            x=is.read();
            System.out.println("COnsumer "+x);
            System.out.flush();
            }
            catch(Exception e){};
        }
    }
}
class pipedDemo 
{
    public static void main(String args[]) throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pis.connect(pos);
        producer p=new producer(pos);
        Consumer c=new Consumer(pis);
        p.start();
        c.start();
    }
}
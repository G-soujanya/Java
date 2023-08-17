import java.lang.*;
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY);
    }
}
class methodsThread
{
    public static void main(String args[])
    {
        MyThread t=new MyThread("My Thread 1");
        System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Prioirity "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
    }
}
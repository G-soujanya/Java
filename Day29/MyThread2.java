public class MyThread2 extends Thread{
    MyData d;
    MyThread2(MyData data)
    {
        d=data;
    }
    public void run()
    {
        d.display("welcome to multithreading concept");
    }
}

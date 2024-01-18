public class MyThread1 extends  Thread{
    MyData d;
    MyThread1(MyData data)
    {
        d=data;
    }
    public void run(){
        d.display("Hello world");
    }
}

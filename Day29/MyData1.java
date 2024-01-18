public class MyData1{
    int value=0;
    boolean flag=true;
    synchronized void set(int v) throws InterruptedException {
        while (!flag)
            wait();
        flag=false;
        value=v;
        notify();
    }
    synchronized int get() throws InterruptedException {
        while (flag)
            wait();
        int x=value;
        flag=true;
        notify();
        return x;
    }
}

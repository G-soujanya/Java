public class Consumer extends Thread{
    MyData1 d;
    Consumer(MyData1 data)
    {
        d=data;
    }
    public void run() {
        while (true)
        {
            try {
                System.out.println("consumer"+d.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

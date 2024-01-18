public class Producer extends Thread{
    MyData1 d;
    Producer(MyData1 data)
    {
        d=data;
    }
    public void run()
    {
        int i=1;
        while (true)
        {
            try {
                d.set(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("producer"+i);
            i++;
        }
    }

}

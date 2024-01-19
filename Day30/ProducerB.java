import java.io.IOException;
import java.io.OutputStream;

public class ProducerB extends Thread{
    OutputStream os;
    public ProducerB(OutputStream o)
    {
        os=o;
    }
    public void run()
    {
        int count=1;
        while (true)
        {
            try {
                os.write(count);
                os.flush();
                System.out.println("producer"+count);
                System.out.flush();
                Thread.sleep(10);
                count++;

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

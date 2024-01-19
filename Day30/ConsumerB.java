import java.io.IOException;
import java.io.InputStream;

public class ConsumerB extends Thread{
    InputStream is;
    public ConsumerB(InputStream i)
    {
        is=i;
    }
    public void run()
    {
        int x;
        while (true)
        {
            try{
                x=is.read();
                System.out.println("consumer"+x);
                System.out.flush();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class MultiThreading2 implements Runnable{
    public void run(){
        int i=1;
        while (true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }

}

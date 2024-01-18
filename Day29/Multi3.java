public class Multi3 extends Thread{
    public  Multi3(String name)
    {
        super(name);
    }
    public void run()
    {
        int count=1;
        while (true)
        {
            System.out.println(count++);
            try{
                Thread.sleep(60);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

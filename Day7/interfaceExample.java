import java.lang.*;
class phone
{
    public void call()
    {
        System.out.println("phone call");
    }
    public void sms()
    {
        System.out.println("phone sending msgs");
    }
}
interface camera
{
    void click();
    void record();
}
interface musicPlayer
{
    void play();
    void stop();
}
class smartphone extends phone implements camera,musicPlayer
{
     public void click()
        {
            System.out.println("clicked");
        }
        public void record()
        {
            System.out.println("record");
        }
        public void play()
        {
            System.out.println("played");
        }
        public void stop()
        {
            System.out.println("stoped");
        }
}    
class interfaceExample 
{
    public static void main(String args[])
    {
        smartphone sm=new smartphone();
        sm.click();;
    }
}

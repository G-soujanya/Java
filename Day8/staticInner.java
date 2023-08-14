import java.lang.*;
class outer
{
    static int x=10;
    int y=20;
    static class inner 
    {
        public void display()
        {
            System.out.println(x);
        }
    }
}
class staticInner 
{
    public static void main(String args[])
    {
        outer.inner i=new outer.inner();
        i.display();
    }    
}

import java.lang.*;
class outer
{
    int x=10;
    inner i=new inner();
    class inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    public void outerDisplay()
    {
        
        i.innerDisplay();
        System.out.println(i.y);
    }
}
class nestedIneer
{
    public static void main(String args[])
    {
        outer.inner oi=new outer().new inner();
        oi.innerDisplay();;
    }
}
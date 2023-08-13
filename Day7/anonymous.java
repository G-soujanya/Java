import java.lang.*;
interface my
{
     public void show();
}
class outer 
{
    public void display()
    {
        new my()
        {
            public void show()
            {
                System.out.println("helloworld");
            }
        }.show();
        //m.show();
    }
}
class anonymous 
{
    public static void main(String arg[])
    {
        outer o=new outer();
        o.display();;
    }    
}

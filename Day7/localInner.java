import java.lang.*;
class outer
{
    public void display()
    {
        class inner 
        {
            public void show()
            {
                System.out.println("hello");
            }
        }
        new inner().show();
        
    }
}
class localInner 
{
    public static void main(String args[])
    {
        outer o=new outer();
        o.display();
    }    
}

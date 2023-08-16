import java.lang.*;
class exceptionHandling
{
    public static void main(String args[])
    {
        int a=10;
        int b=0,c;
        try
        {
        c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
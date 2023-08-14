import java.lang.*;
class customer
{
    private String custNo;
    private static int count=1;
    private static String genid()
    {
        String c="c"+count;
        count++;
        return c;
    }
    public customer()
    {
        custNo=genid();
    }
    public String getcustid()
    {
        return custNo;
    }
}
class accountNoGen 
{
    public static void main(String arg[])
    {
        customer c=new customer();
        System.out.println(c.getcustid());
        customer c1=new customer();
        System.out.println(c1.getcustid());
    }    
}

import java.lang.*;
class NegativeDimensionException extends Exception
{
    public String tostring()
    {
        return "dimensions of rectangle cannot be neagtive";
    }
}
class throwKeyword 
{
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println(area(10,5));
    }
    public static void main(String arg[]) 
    {
        try{
        meth1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

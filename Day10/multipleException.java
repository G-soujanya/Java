import java.lang.*;
class multipleException
{
    public static void main(String args[])
    {
        /*int A[]={30,20,10,40,0};
        try
        {
        int c=A[0]/A[4];
        System.out.println("Division is"+c);
        System.out.println(A[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Bye");*/
        int A[]={30,20,10,40,0};
        try
        {
            int c=A[0]/A[4];
            System.out.println("Division is"+c);
            try
            {
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be zero");
        }
    }
}
import java.lang.*;
class BiggestThree
{
    public static void main(String arg[])
    {
        int a=5,b=2,c=10;
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else{
            if(b>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}
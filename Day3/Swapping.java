import java.lang.*;
class Swapping
{
    public static void main(String arg[])
    {
        int a=0b1010;
        int b=0b0101;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
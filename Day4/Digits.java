import java.lang.*;
class Digits
{
    public static void main(String args[])
    {
        int i=153;
        int temp=i;
        int count=0;
        int x;
        while(i>0)
        {
            x=i%10;
            count=count+x*x*x;
            i=i/10;
        }
        if(count==temp)
        {
            System.out.println("Armstrong Numbers");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
    }
}
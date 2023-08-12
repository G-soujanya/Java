import java.lang.*;
class Maxvararg 
{
    static int max(int ...x)
    {
        if(x.length==0)
            return Integer.MIN_VALUE;
        int m=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>m)
                m=x[i];
        }
        return m;
    }
    static int sum(int ...x)
    {
        int m=0;
        for(int i=0;i<x.length;i++)
        {
            m+=x[i];
        }
        return m;
    }
    static double discount(double ...x)
    {
        double m=0;
        for(int i=0;i<x.length;i++)
        {
            m+=x[i];
        }
        if(m<500)
            m-=m*10/100;
        else if(m>500 && m<1000)
        {
            m-=m*15/100;
        }
        else if(m>=1000)
        {
            m-=m*30/100;
        }
        return m;
    }
    public static void main(String args[])
    {
        System.out.println(max(1,2,3,4));
        System.out.println(max());
        System.out.println("sum is"+sum(1,2,3,4));
        System.out.println("diccount is"+discount(1,2,3,4));
    }
}

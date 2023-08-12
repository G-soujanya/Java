import java.lang.*;
class Prime 
{
    static void prime(int n)
    {
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
    public static void main(String arg[])
    {
        int x=2;
        prime(x);
    }    
}

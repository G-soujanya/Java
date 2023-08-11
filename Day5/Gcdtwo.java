import java.lang.*;
class Gcdtwo 
{
    static int gcd(int x,int y)
    {
        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
            if(x==y)
                break;
        }
        return x;
    }
    public static void main(String arg[])
    {
        int x=35,y=56;
        System.out.println(gcd(x,y));
    }    
}

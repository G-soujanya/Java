import java.lang.*;
class ReverseNumber
{
    public static void main(String args[])
    {
        int n=232;
        int temp=n;
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOt palindroe");
        }
    }
}
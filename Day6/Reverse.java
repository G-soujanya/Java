import java.lang.*;
class Reverse 
{
    static int reverse(int x)
    {
         int rev=0,r;
         while(x>0)
         {
            r=x%10;
            rev=rev*10+r;
            x=x/10;
         }
         return rev;
    }
    static void reverse(int A[])
    {
        int B[]=new int[A.length];
        int count=0;
        for(int i=A.length-1;i>=0;i--)
        {
            B[count]=A[i];
            count++;
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int x=124;
        int A[]={1,2,3,4,5};
        System.out.println(reverse(x));
        reverse(A);
    }    
}

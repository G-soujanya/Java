import java.lang.*;
import java.util.*;
class SumOfArray
{
    public static void main(String args[])
    {
        int A[]={1,2,3,5,4};
        /*int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println(sum);
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the element to search");
        n=sc.nextInt();
        for(int i=0;i<A.length;i++)
        { 
            if(A[i]==n)
            {
                System.out.println("element found at position"+(i+1));
            }
        }*/
        int max=0;
        int secmax=0;
        for(int i=0;i<A.length;i++)
        { 
            if(A[i]>max)
            {
                secmax=max;
                max=A[i];
            }
            else if(A[i]<max && A[i]>secmax)
            {
                secmax=A[i];
            }
        }
        System.out.println(secmax);
    }
}

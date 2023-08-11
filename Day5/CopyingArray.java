import java.lang.*;
class CopyingArray 
{
    public static void main(String args[])
    {
        int A[]={1,2,3,4};
        int B[]=new int[2*A.length];
        /*for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(B[i]+" ");
        }
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(B[i]+" ");
        }*/
        System.out.println(A.length);
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;
        System.out.println(A.length);
    }
}

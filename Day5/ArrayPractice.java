import java.lang.*;
class ArrayPractice
{
    public static void main(String args[])
    {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int C[];
        C=new int[10];
        int []D=new int[5];
        B[2]=15;
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }
        System.out.println("B");
        for(int x:B)
        {
            System.out.println(x);
        }
        System.out.println(B);
    }
}
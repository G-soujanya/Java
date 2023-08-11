import java.lang.*;
import java.util.*;
class InsertionArray 
{
    public static void main(String args[])
    {
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        Scanner sc=new Scanner(System.in);
        int n,index,i;
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("Enter the index");
        index=sc.nextInt();
        for(i=6;i>index;i--)
        {
            A[i]=A[i-1];
        }
        A[i]=n;
        for(int j=0;j<A.length;j++)
        {
            System.out.print(A[j]+" ");
        }
    }
}

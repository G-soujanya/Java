import java.lang.*;
import java.util.*;
class DelectArray 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int index;
        System.out.println("Enter the index where to delect");
        index=sc.nextInt();
        int A[]={1,2,3,4,5};
        for(int i=index+1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        for(int j=0;j<A.length;j++)
        {
            System.out.print(A[j]+" ");
        }
    }    
}

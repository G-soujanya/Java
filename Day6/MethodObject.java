import java.lang.*;
class MethodObject 
{
    static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    static void change2(int x,int value)
    {
        x=value;
    }
    public static void main(String arg[])
    {
        int A[]={2,3,4,6,10};
        change(A,2,20);
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        int x=15;
        change2(x,20);
        System.out.println(x);
    }    
}

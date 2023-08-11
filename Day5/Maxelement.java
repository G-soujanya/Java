import java.lang.*;
class Maxelement 
{
    static int max(int x[])
    {
        int ma=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>ma)
            {
                ma=x[i];
            }
        }
        return ma;
    }
    public static void main(String args[])
    {
        int A[]={1,2,3,4,5};
        System.out.println(max(A));
    }    
}

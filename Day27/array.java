import java.util.*;
class Array 
{
    int a[]=new int[5];
    int min;
    int max=0;
    Scanner sc=new Scanner(System.in);
    void fill()
    {
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    int max()
    {
        for(int i=0;i<5;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    int min()
    {
        min=a[0];
        for(int i=0;i<5;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
    void display()
    {
        System.out.println("maximum is"+max);
        System.out.println("Minimum is"+min);
        System.out.println("array elements are");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
class array
{
    public static void main(String args[])
    {
        Array a=new Array();
        a.fill();
        System.out.println("maximum is"+a.max());
        System.out.println("minimum is"+a.min());
        a.display();
    }
}

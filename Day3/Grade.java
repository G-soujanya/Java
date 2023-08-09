import java.lang.*;
import java.util.*;
class Grade
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int maths,phy,en;
        maths=sc.nextInt();
        phy=sc.nextInt();
        en=sc.nextInt();
        int sum;
        sum=maths+phy+en;
        float avg;
        avg=sum/3;
        if(avg>=70)
        {
            System.out.println("A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}
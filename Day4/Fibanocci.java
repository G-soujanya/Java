import java.lang.*;
import java.util.Scanner;
class Fibanocci 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter number of terms");
        a=sc.nextInt();
        int t1=0;
        int t2=1;
        int temp;
        System.out.print(t1+",");
        for(int i=1;i<=a;i++)
        {
            System.out.print(t2+",");
            temp=t2;
            t2=t1+t2;
            t1=temp;
        }
    }
}
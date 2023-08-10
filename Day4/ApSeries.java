import java.lang.*;
import java.util.*;
class ApSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        System.out.println("Enter the first term");
        a=sc.nextInt();
        System.out.println("Enter the common difference");
        d=sc.nextInt();
        System.out.println("Enter the number of term");
        n=sc.nextInt(); 
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+",");
            a=a*d;
        }
    }
}

import java.lang.*;
import java.util.Scanner;
class OddEven
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
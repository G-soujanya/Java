import java.lang.*;
import java.util.Scanner; 
class Triangle
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s;
        System.out.println("Enter the sides of triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=0.5f*(a+b+c);
        double result;
        result=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(result);
    }
}
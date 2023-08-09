import java.lang.*;
import java.util.Scanner;
class Root
{
    public static void main(String arg[])
    {
        int a,b,c;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1=(-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
        r2=(-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
        System.out.println("roots are"+r1+" "+r2);
    }
}

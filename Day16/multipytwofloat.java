import java.util.*;
class multipytwofloat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        /*float f1,f2;
        System.out.println("enter two float numbers to multiply");
        f1=sc.nextFloat();
        f2=sc.nextFloat();
        float f3;
        f3=f1*f2;
        System.out.println(f3);*/
        /*int a,b;
        System.out.println("enter two numbers to swap");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("before swapping"+a+b);
        System.out.println("");
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.printf("after swapping"+a+b);*/
        sc.useRadix(2);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int z;
        z=a+b;
        System.out.println(Integer.toBinaryString(z));
    }
}
import java.util.*;
class gcd 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("enter the two numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else if(y>x)
                y=y-x;
            if(x==y)
                break;
        }
        System.out.println(x);
    }    
}

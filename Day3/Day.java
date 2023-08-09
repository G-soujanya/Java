import java.lang.*;
import java.util.*;
class Day
{
    public static void main(String arg[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number");
        i=sc.nextInt();
        if(i==1)
        {
            System.out.println("Sunday");
        }
        else if(i==2)
        {
            System.out.println("Monday");
        }
        else if(i==3)
        {
            System.out.println("tuesday");
        }
        else if(i==4)
        {
            System.out.println("wednesday");
        }
        else if(i==5)
        {
            System.out.println("Thursday");
        }
        else if(i==6)
        {
            System.out.println("Friday");
        }
        else if(i==7)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("not valid number ");
        }
    }
}
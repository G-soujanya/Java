import java.lang.*;
import java.util.*;
class Leap
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int year;
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Leap Year");
                }
                else
                {
                    System.out.println("not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
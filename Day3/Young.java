import java.lang.*;
import java.util.Scanner;
class Young
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        age=sc.nextInt();
        if(age>=14 && age<=55)
        {
            System.out.println("Young");
        }
        else
        {
            System.out.println("Not Young");
        }
    }
}
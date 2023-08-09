import java.lang.*;
import java.util.Scanner;
class Arithematic
{
    public static void main(String args[])
    {
        System.out.println("Menu1.ADD2.SUB3.MUL4.DIV");
        Scanner sc=new Scanner(System.in);
        int a,b;
        String option;
        System.out.println("Enter the teo numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        option=sc.next();
        switch(option)
        {
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "DIV":
                System.out.println(a/b);
                break;
            default:
                System.out.println("not valid option");
                break;
            
        }
    }
}
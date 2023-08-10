import java.lang.*;
import java.util.Scanner;
class NumberInWords
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int r;
        String str="";
        while(n>0)
        {
            r=n%10;
            switch(r)
            {
                case 1:
                    str="one"+str;
                    break;
                case 2:
                    str="two"+str;
                    break;
                case 3:
                    str="three"+str;
                    break;
                case 4:
                    str="four"+str;
                    break;
                case 5:
                    str="five"+str;
                    break;
                case 6:
                    str="six"+str;
                    break; 
                case 7:
                    str="seven"+str;
                    break; 
                case 8:
                    str="eight"+str;
                    break; 
                case 9:
                    str="nine"+str;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            n=n/10;
        }
        System.out.println(str);
    }
}
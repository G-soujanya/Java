import java.lang.*;
class Radix
{
    public static void main(String args[])
    {
        String str;
        str="129A";
        if(str.matches("[01]+"))
        {
            System.out.println("Given number is binary number");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("Given number is octal number");
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println("Given number is decimal number");
        }
        else if(str.matches("[0-9A-F]+"))
        {
            System.out.println("Given number is hexa decimal number");
        }
        else
        {
            System.out.println("Given number is not a number");
        }
    }
}
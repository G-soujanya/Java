import java.lang.*;
class FIndingNumType 
{
    public static void main(String args[])
    {
        int b=10111;
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]*"));
        int b1=0x12;
        System.out.println(b);
        String str1=String.valueOf(b);
        System.out.println(str);
        System.out.println(str.matches("[0-9A-F]+"));
        String d="10/02/20238";
        System.out.println(d.matches("[0-3][0-9]/[0-9][0-9]/[0-9]{4}"));
    }
}
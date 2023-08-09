import java.lang.*;
class Quantifiers
{
    public static void main(String args[])
    {
        String str="john@gmail.com";
        System.out.println(str.matches("\\w*@gmail.*"));
    }
}
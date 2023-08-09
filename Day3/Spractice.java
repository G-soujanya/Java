import java.lang.*;
class Spractice
{
    public static void main(String args[])
    {
        String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Sha",4));
        System.out.println(str1.endsWith("Khan"));
        for(int i=0;i<str1.length();i++)
        {
            System.out.print(str1.charAt(i));
        }
        String str="udemy.com.";
        System.out.println(str1.indexOf("udemy"));
        System.out.println(str1.lastIndexOf("."));
        String str4="pyramid wall";
        String str2="great";
        System.out.println(str1.contains("wall"));
        int i=1;
        String s;
        s=String.valueOf(i);
        System.out.println(s);
    }
}
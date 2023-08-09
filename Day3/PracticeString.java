import java.lang.*;
class PracticeString
{
    public static void main(String args[])
    {
        String str="so!ujanya@gmail";
        str=str.replaceAll("\\W", "");
        System.out.println(str);
        String str1="soujanya gmail";
        str1=str1.replaceAll(" ","");
        System.out.println(str1);
        String str2="    soujanya  gmail com   ";
        str2=str2.replaceAll("\\s+"," ").trim();
        String word[]=str2.split("\\s");
        System.out.println(word.length);
    }
}

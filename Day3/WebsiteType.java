import java.lang.*;
class WebsiteType
{
    public static void main(String arg[])
    {
        String str1,str;
        str1="https//www.google.org";
        int i;
        i=str1.lastIndexOf(".");
        str=str1.substring(i+1, str1.length());
        if(str.equals("com"))
        {
            System.out.println("commercial");
        }
        else if(str.equals("org"))
        {
            System.out.println("organization");
        }
        else if(str.equals("gov"))
        {
            System.out.println("governamenr");
        }
        else if(str.equals("net"))
        {
            System.out.println("net");
        }
    }
}

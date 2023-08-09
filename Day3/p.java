import java.lang.*;
class p
{
    public static void main(String args[])
    {
        String str1="Java";
        String str2=new String("Java");
        System.out.println(str1==str2);
        System.out.println(str1.length());
        str1=str1.toLowerCase();
        System.out.println(str1);
        String st=new String("   netbeans  ");
        System.out.println(st);
        st=st.trim();
        System.out.println(st);
        str2=st.substring(3,7);
        System.out.println(str2);
        String str3=new String("netbeans");
        String str4=str3.replace('e','M');
        System.out.println(str4);
    }
}
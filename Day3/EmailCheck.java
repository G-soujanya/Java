import java.lang.*;
class EmailCheck
{
    public static void main(String args[])
    {
        String str="programmmer@gmail.com";
        int i=str.indexOf("@");
        String user;
        user=str.substring(0,i);
        String domain;
        domain=str.substring(i+1,str.length());
        System.out.println(str.matches("\\w*@gmail.*"));
        System.out.println(user+" "+domain);
        System.out.println(domain.startsWith("gmail"));
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}
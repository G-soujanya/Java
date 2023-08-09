import java.lang.*;
class WebsiteCheckSwitch
{
    public static void main(String arg[])
    {
        String str="https//www.google.com";
        int i;
        i=str.lastIndexOf(".");
        str=str.substring(i+1);
        switch(str)
        {
            case "com":
                System.out.println("commercial");
                break;
            case "gov":
                System.out.println("governement");
                break;
            case "org":
                System.out.println("organisation");
                break;
            case "net":
                System.out.println("network");
                break;
            default:
                System.out.println("not valid");
                break;
            
            
        }
    }
}
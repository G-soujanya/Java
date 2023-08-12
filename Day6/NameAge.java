import java.lang.*;
class NameAge {
    static boolean validate(String name)
    {
        if(name.matches("[a-zA-Z\\s]*"))
        {
            return true;
        }
        return false;
    }
    static boolean validate(int a)
    {
        if(a>3 && a<13)
        {
            return true;
        }
        return false;

    }
    public static void main(String args[])
    {
        String name="gabu9 soujanya";
        int age=10;
        System.out.println(validate(name));
        System.out.println(validate(age));
    }
}

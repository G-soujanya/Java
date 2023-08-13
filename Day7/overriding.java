import java.lang.*;
class superclass
{
    public void display()
    {
        System.out.println("super class method");
    }
}
class subclass extends superclass
{
    public void display()
    {
        System.out.println("sub class method");
    }
}
class overriding
{
    public static void main(String args[])
    {
        superclass su=new superclass();
        su.display();
        subclass sub=new subclass();
        sub.display();
        superclass susub=new subclass();
        susub.display();
    }
}
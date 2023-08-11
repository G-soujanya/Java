import java.lang.*;
class parent
{
    parent()
    {
        System.out.println("non-param parent constructor");
    }
    parent(int x)
    {
        System.out.println("param parent constructor"+x);
    }
}
class child extends parent
{
    child()
    {
        System.out.println("non-param child constructor");
    }
    child(int y)
    {
        System.out.println("non-param child constructor"+y);
    }
    child(int y,int x)
    {
        super(x);
        System.out.println("non-param child constructor"+y);
    }
}
class constructorParam 
{
    public static void main(String args[])
    {
        child c=new child(10,20);

    }    
}

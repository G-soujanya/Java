import java.lang.*;
class superclass
{
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println(" super meth2");
    }
}
class subclas extends superclass 
{
    public void meth2()
    {
        System.out.println("sub meth2");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
}
class dynamicDispatch 
{
    public static void main(String arg[])
    {
        superclass s=new subclas();
        s.meth2();

    }    
}

import java.lang.*;
interface Test
{
    void meth1();
    void meth2();
}
class my implements Test
{
    public void meth1()
    {
        System.out.println("method1");
    }
    public void meth2()
    {
        System.out.println("method2");
    }
    public void meth3()
    {
        System.out.println("method3");
    }
}
class interfacePractice
{
    public static void main(String arg[])
    {
        my t=new my();
        t.meth3();
    }
}
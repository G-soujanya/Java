import java.lang.*;
import pack.Demo1;
import pack.Demo2;
import pack.inner.Demo3;
class usepack
{
    public static void main(String arg[])
    {
        Demo1 d=new Demo1();
        d.display();
        Demo2 d1=new Demo2();
        d1.display();
        Demo3 d2=new Demo3();
        d2.display();
    }
}
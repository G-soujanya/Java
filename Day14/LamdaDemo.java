@FunctionalInterface
interface MyLambda 
{
    public int add(int x,int y);
}
/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/
public class LamdaDemo 
{
    public static void main(String args[])
    {
       MyLambda m=(a,b)->a+b;
       System.out.println(m.add(10,1));
    }
}
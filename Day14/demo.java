interface MyLambda 
{
    public void display();
}
/*class demo1
{
    int temp;
    public void method1()
    {
        /*int count=0;
        MyLambda ml=()->{
            //int count=0;
            //count++;
            System.out.println("hello");
            System.out.println("hiiii"+count);
            System.out.println("hiiii"+temp);
            temp++;
        };
        ml.display();
    }
}*/
class UseLambda 
{
    public void call(MyLambda ml)
    {
        ml.display();
    }
}
class demo1{
    public void meth1()
    {
        UseLambda ul=new UseLambda();
        ul.call(()->{System.out.println("hi");}); 
    }
}
class demo 
{
    public static void main(String args[])
    {
        demo1 d=new demo1();
        d.meth1();
    }    
}

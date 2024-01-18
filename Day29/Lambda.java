class Main
{

    public static void main(String args[])
    {
        UseLambda u=new UseLambda();
        u.call(()-> System.out.println("hi"));
    }
}
@FunctionalInterface
interface MyLambda{
    void display();
}
class UseLambda{
    public void call(MyLambda m){
        m.display();
    }
}

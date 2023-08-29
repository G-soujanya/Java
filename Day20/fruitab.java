abstract class Fruit 
{
    abstract public void cost();
}
class Apple extends Fruit 
{
    public void cost()
    {
        System.out.println("100");
    }
}
class Mango extends Fruit 
{
    public void cost()
    {
        System.out.println("200");
    }
}
class fruitab 
{
    public static void main(String args[])
    {
        Apple a=new Apple();
        a.cost();
        Mango m=new Mango();
        m.cost();
    }    
}

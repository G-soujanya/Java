interface Fruit 
{
    void cost();
}
class Apple implements Fruit 
{
    public void cost()
    {
        System.out.println("10");
    }
}
class Mango implements Fruit 
{
    public void cost()
    {
        System.out.println("20");
    }
}
class fruitinter 
{
    public static void main(String args[])
    {
        Apple a=new Apple();
        a.cost();
        Mango m=new Mango();
        m.cost();
    }    
}

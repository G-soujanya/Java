import java.lang.*;
class coffeeMachine
{
    private float coffeQty;
    private float waterQty;
    private static coffeeMachine our=null;
    private coffeeMachine()
    {
        coffeQty=1;
        waterQty=1;
    }
    static public coffeeMachine getInstance()
    {
        if(our==null)
            our=new coffeeMachine();
        return our;
    }
}
class singletonClass
{
    public static void main(String args[])
    {
        coffeeMachine c=coffeeMachine.getInstance();
        coffeeMachine c1=coffeeMachine.getInstance();
        if(c==c1)
            System.out.println("same");
    }    
}

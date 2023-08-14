import java.lang.*;
class coffeeMachine
{
    private float coffeQty;
    private float waterQty;
    private static int count=0;
    private static coffeeMachine our;
    private coffeeMachine()
    {
        coffeQty=1;
        waterQty=1;
        count++;
    }
    static public coffeeMachine getInstance()
    {
        if(count<=5)
            our=new coffeeMachine();
        return our;
    }
}
class limitObjects
{
    public static void main(String args[])
    {
        coffeeMachine c=coffeeMachine.getInstance();
        coffeeMachine c1=coffeeMachine.getInstance();
        coffeeMachine c2=coffeeMachine.getInstance();
        coffeeMachine c3=coffeeMachine.getInstance();
        coffeeMachine c4=coffeeMachine.getInstance();
        coffeeMachine c5=coffeeMachine.getInstance();
        coffeeMachine c6=coffeeMachine.getInstance();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }    
}

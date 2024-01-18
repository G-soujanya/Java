public class SingletonClass {
    private float coffeQty;
    private float waterQty;
    static private SingletonClass our=null;
    static int count=0;
    private SingletonClass(){
        coffeQty=1;
        waterQty=1;
    }
    public static SingletonClass getInstance()
    {
        if(count<3) {
            our = new SingletonClass();
            count++;
        }
        else
            System.out.println("3 objects is already created");
        return our;
    }
}

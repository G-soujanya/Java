import java.lang.*;
class Test
{
    static 
    {
        System.out.println("Block1");
    }
    static 
    {
        System.out.println("Block2");
    }
}
class staticBlock 
{
    public static void main(String arg[])
    {
        System.out.println("main");
        Test t=new Test();
        
    }    
}

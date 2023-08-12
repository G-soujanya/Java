import java.lang.*;
class MethodOver 
{
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(float x,float y)
    {
        return x>y?x:y;
    }
    static int max(int x,int y,int z)
    {
        return (x>y && x>z)?x:(y>z)?y:z;
    }
    public static void main(String arg[])
    {
        System.out.println(max(10,50,90));
    }    
}

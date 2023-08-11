import java.lang.*;
class Area 
{
    static int area(int x,int y)
    {
        return x*y;
    }
    static double area(int r)
    {
        return Math.PI*r*r;
    }
    public static void main(String args[])
    {
        int l=10,b=20;
        int r=10;
        System.out.println(area(l,b));
        System.out.println(area(r));
    }    
}

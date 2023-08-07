import java.lang.*;
import java.util.*;
class Cuboid
{
    public static void main(String args[])
    {
        int l,g,h;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        g=sc.nextInt();
        h=sc.nextInt();
        int area;
        area=2*(l*g+g*h+h*l);
        int volume;
        volume=l*g*h;
        System.out.println("Area is"+area+"volume is"+volume);
    }
}

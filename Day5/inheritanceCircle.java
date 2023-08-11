import java.lang.*;
class circle 
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
class cylinder extends circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
class inheritanceCircle 
{
    public static void main(String arg[])
    {
        cylinder c=new cylinder();
        c.radius=7;
        c.height=10;
        System.out.println(c.volume());
         System.out.println(c.area());
    }
}

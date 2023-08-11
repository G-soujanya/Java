import java.lang.*;
class cir 
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
class Circle 
{
    public static void main(String args[])
    {
        cir ca=new cir();
        ca.radius=7;
        System.out.println("Area"+ca.area());
        System.out.println("Perimeter"+ca.perimeter());
        System.out.println("circumference"+ca.circumference());

    }    
}

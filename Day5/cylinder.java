import java.lang.*;
class cylin 
{
    public double radius;
    public double height;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea()
    {
        return circumference()*(height+radius);
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}
class cylinder 
{
    public static void main(String args[])
    {
        cylin c=new cylin();
        c.radius=7;
        c.height=10;
        System.out.printf("Area %6.2f",c.area());
        System.out.println("");
        System.out.printf("totalSurface area %6.2f",c.totalSurfaceArea());
        System.out.println("");
        System.out.printf("volume %6.2f",c.volume());
    }
}

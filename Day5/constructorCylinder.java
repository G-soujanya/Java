import java.lang.*;
class cylinder 
{
     private double radius;
     private double height;
     public cylinder()
     {
        radius=1;
        height=1;
     }
     public cylinder(int r,int h)
     {
        radius=r;
        height=h;
     }
     public double getRadius()
     {
        return radius;
     }
     public double getHeight()
     {
        return height;
     }
     public void setRadius(int r)
     {
        radius=r;
     }
     public void setHeight(int h)
     {
        height=h;
     }
}
class constructorCylinder 
{
    public static void main(String args[])
    {
        cylinder sc=new cylinder(10,20);
        System.out.println(sc.getRadius());
        System.out.println(sc.getHeight());
    }    
}

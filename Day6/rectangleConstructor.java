import java.lang.*;
class Rectangle 
{
    int length;
    int breadth;
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rectangle
{
    int height;
    Cuboid()
    {
        height=1;
    }
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int h,int l,int b)
    {
        super(l,b);
        height=h;
    }
    public int volume()
    {
        return length*breadth*height;
    }
}
class rectangleConstructor 
{
    public static void main(String args[])
    {
        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume()); 
    }
}

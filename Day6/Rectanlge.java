import java.lang.*;
class rect 
{
    private int length;
    private int breadth;
    int area()
    {
        return length*breadth;
    }
    int perimeter()
    {
        return (2*(length+breadth));
    }
    boolean isSquare()
    {
        if(length==breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setLength(int l)
    {
        if(l>0)
        length=l;
        else
        length=0;
    }
    public void setBreadth(int b)
    {
        if(b>=0)
        breadth=b;
        else
        breadth=0;
    }
    public rect()
    {
        length=1;
        breadth=1;
    }
    public rect(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public rect(int n)
    {
        length=breadth=n;
    }
}
class Rectanlge 
{
    public static void main(String args[])
    {
        rect r=new rect(10,20);
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Square or not"+r.isSquare());


    }    
}

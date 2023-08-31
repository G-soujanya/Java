class Rectangle
{
    int length;
    int breadth;
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void area()
    {
        System.out.println(length*breadth);
    }
}
class rectangle 
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle(1, 2);
        r.area();
    }    
}

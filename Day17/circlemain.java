class Circle 
{
    int radius;
    public Circle()
    {
        radius=0;
    }
    public void setradius(int r)
    {
        radius=r;
    }
    public void area()
    {
        System.out.println(Math.PI*radius*radius);
    }
    public void circum()
    {
        System.out.println(2*Math.PI*radius);
    }
}
class circlemain 
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.setradius(1);
        c.area();
        c.circum();
    } 
}

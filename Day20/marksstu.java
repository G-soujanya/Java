class Marks 
{
    int m1;
    int m2;
    int m3;
    public Marks()
    {
        m1=0;
        m2=0;
        m3=0;
    }
    public void in(int mm1,int mm2,int mm3)
    {
        m1=mm1;
        m2=mm2;
        m3=mm3;
    }
    public int sum()
    {
        return m1+m2+m3;
    }
    public float avg()
    {
        return sum()/3;
    }
}
class marksstu 
{
    public static void main(String args[])
    {
        Marks m=new Marks();
        m.in(1,2,3);
        System.out.println(m.sum());
        System.out.println(m.avg());
    }    
}

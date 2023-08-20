import java.lang.reflect.*; 
class My 
{
    private int a;
    protected int b;
    public int c;
    int d;
    public My()
    {

    }
    public My(int x,int y)
    {

    }
    public void display(String s1,String s2)
    {

    }
    public int show(int x,int y)
    {
        return 0;
    }
}
class reflectDemo 
{
    public static void main(String arg[])
    {
        
        Class c;//class for getting defination of any other class 
        c=My.class;
       // My m=new My();
        //Class c1=m.getClass();
        //System.out.println(c.getName());
        //Field field[]=c.getDeclaredFields();
        //for(Field x:field)
        //System.out.println(x);
        /*Constructor con[]=c.getConstructors();
        for(Constructor h:con)
        {
            System.out.println(h);
        }*/
        Method con[]=c.getMethods();
        for(Method h:con)
        {
            System.out.println(h);
        }
        Parameter p[]=con[0].getParameters();
        for(Parameter j:p)
        {
            System.out.println(j);
        }
    }    
}

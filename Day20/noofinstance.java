class Instance 
{
    static int count=0;
    public Instance()
    {
        count++;
    }
}
class noofinstance 
{
    public static void main(String args[])
    {
        Instance i=new Instance();
        Instance j=new Instance();
        Instance k=new Instance();
        System.out.println(Instance.count);
    }    
}

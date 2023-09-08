class Obj 
{
    static int noOfObjects;
    int serialNumber;
    Obj()
    {
        noOfObjects++;
        serialNumber=noOfObjects;
    }
    void query()
    {
        System.out.println("i am object number"+serialNumber);
    }
}
class NoOfObjects 
{
    public static void main(String args[])
    {
        Obj o1=new Obj();
        o1.query();
        Obj o2=new Obj();
        o2.query();
        Obj o3=new Obj();
        o3.query();
        o1.query();
    }    
}

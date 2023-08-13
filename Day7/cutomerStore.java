import java.lang.*;
interface member
{
    void callback();
}
class customer implements member
{
    String name;
    customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("ok i will visit"+name);
    }
}
class store
{
    member mem[]=new member[100];
    int count=0;
    void register(member m)
    {
        mem[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callback();
        }
    }
}
class cutomerStore 
{
    public static void main(String arg[])
    {
        store s=new store();
        customer c1=new customer("john");
        customer c2=new customer("suguna");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }    
}

import java.lang.*;
class product
{
    private int itemno;
    private String name;
    private int price;
    private int qty;
    public int getItemNo()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setItemNo(int i)
    {
        itemno=i;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setPrice(int p)
    {
        price=p;
    }
    public void setQty(int q)
    {
        qty=q;
    }
    public product()
    {
        itemno=1;
        name="";
        price=1;
        qty=1;
    }
    public product(int i,String n,int p,int q)
    {
        itemno=i;
        name=n;
        price=p;
        qty=q;
    }
}
class customer
{
    private String custid;
    private String name;
    private String address;
    private long phno;
    public String getCustid()
    {
        return custid;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public long getPhono()
    {
        return phno;
    }
    public void setCustid(String i)
    {
        custid=i;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setAddress(String a)
    {
        address=a;
    }
    public void setPhno(long p)
    {
        phno=p;
    }
    public customer()
    {
        custid="R180161";
        name="soujanya";
        address="anantapur";
        phno=9676096351l;
    }
    public customer(String id,String nam,String add,long p)
    {
        custid=id;
        name=nam;
        address=add;
        phno=p;

    }
}
class producerConsumer 
{
    public static void main(String args[])
    {
        product p=new product(161,"nithya",12,1);
        System.out.println(p.getItemNo());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQty());
        customer c=new customer("r180167","suguna","kalyanadurg",7989283442l);
        System.out.println(c.getCustid());
        System.out.println(c.getName());
        System.out.println(c.getAddress());
        System.out.println(c.getPhono());
    }    
}
